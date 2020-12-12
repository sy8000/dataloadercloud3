/*
报告重签脚本
 */

//控制下载报告按钮
function changeBtnable() {
    if ($('#taskidinput').val()) {
        $('#downloadReport').removeClass('layui-btn-disabled');
    } else {
        $('#downloadReport').addClass('layui-btn-disabled');
    }
}

//报告下载任务
/*
$('#taskTable').click(function () {
    var currentRow=$(this).closest("tr");
    alert(currentRow);
});
*/

/*
$(function () {
    var table = $('#taskTable').DataTable();

    $('#taskTable tbody').on( 'click', 'tr', function () {
        console.log( table.row( this ).data() );
    } );
});
*/


//按钮其它
layui.use(['form', 'table', 'layer', 'laydate','upload'], function () {
    $(document).ready(function () {

        var $ = layui.jquery,
            form = layui.form,
            table = layui.table,
            util = layui.util,
            layer = layui.layer,
            upload = layui.upload,
            laydate = layui.laydate;




        //下载报告点击动作
        $('#downloadReport').click(function () {
            //日志用的东西，回头看怎么抽到一起
            var actionlog = "'actionlog':'查询任务单/报告'";
            var actionperson = "'actionpersion':''";
            var actionmodule = "'actionmodule':'客户化'";
            //先写业务代码
            var data = "{'taskid':'" + $('#taskidinput').val() + "'}";
            var loading = layer.load(2);
            $.ajax({
                type: "post",
                url: "/limsaction/searchReport",
                data: data,
                contentType: "application/json;charset=utf-8",
                dataType: "json",
                success: function (res) {
                    //console.log(res);
                    //layer.alert(res);
                    layer.close(loading);
                    if (res.status == -1) {
                        layer.alert(res.des);
                    } else {
                        //打开对话框
                        //layer.alert(res);
                        //console.log(res);
                        var json = eval(res.data);
                        console.log(json.length);
                        var jsontr = '';
                        for (var i = 0; i < json.length; i++) {
                            var j = i + 1;
                            jsontr += '<tr><td>' + j.toString() + '</td></td><td>' + json[i] + '</td></tr>';
                            //console.log(json[i]);
                        }

                        layer.open({
                            type: 1 //Page层类型
                            ,
                            area: ['600px', '300px']
                            ,
                            title: '报告选择'
                            ,
                            shade: 0.6 //遮罩透明度
                            ,
                            maxmin: true //允许全屏最小化
                            ,
                            anim: 1 //0-6的动画形式，-1不开启
                            ,
                            content: '<br /><br /><table class="layui-table" id="taskTable"><colgroup><col width="80"><col width="520"></colgroup><thead><tr><th>序号</th><th>单击下载报告(:后null代表数据库没有源文件，将生成新报告)</th></tr></thead><tbody>' + jsontr + '</tbody></table>'
                        });
                        $("#taskTable tbody").on("click", "tr", function () {
                            var data = new Array();
                            var td = $(this).find("td");
                            for (var i = 1; i < td.length; i++) {
                                data.push(td.eq(i).text());
                            }
                            //alert(data);
                            var rowdataArr ;
                            rowdataArr = data[0].split(":");
                            //\\LIMS_APP\Lims_COA_ShareMenu$\frreport\source\A-200422-0232-01-source-20200521134936.XLS
                            if (rowdataArr[1] != 'null'){
                                window.open('/fileReport/' + rowdataArr[1]);
                                //window.location.href('//LIMS_APP/Lims_COA_ShareMenu$/frreport/source/' + rowdataArr[1]);

                            }else {
                                //"http://10.0.11.82:8080/webroot/decision/view/report?viewlet=HFReport_old.cpt&taskid=" + taskID + "&__filename__="+  exportFileName[1,1]+"&format=excel&extype=page&isExcel2003=true"
                                window.open("http://10.0.11.82:8080/webroot/decision/view/report?viewlet=HFReport_old.cpt&taskid=" + rowdataArr[0] + "&__filename__="+  rowdataArr[0]+"&format=excel&extype=page&isExcel2003=true")
                                //window.open("/url/fineReport/report?viewlet=HFReport_old.cpt&taskid=" + rowdataArr[0] + "&__filename__="+  rowdataArr[0]+"&format=excel&extype=page&isExcel2003=true")
                            }
                        });
                    }

                }
            });
        });




        //多文件列表
        var demoListView = $('#demoList')
            ,uploadListIns = upload.render({
            elem: '#testList'
            ,url: '/limsaction/uploadReport' //改成您自己的上传接口
            ,accept: 'file'
            ,exts: 'xls|xlsx'
            ,size: 102400
            ,multiple: true
            ,auto: false
            ,bindAction: '#testListAction'
            ,choose: function(obj){
                var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列
                //读取本地文件
                obj.preview(function(index, file, result){
                    var tr = $(['<tr id="upload-'+ index +'">'
                        ,'<td>'+ file.name +'</td>'
                        ,'<td>'+ (file.size/1024).toFixed(1) +'kb</td>'
                        ,'<td>等待上传</td>'
                        ,'<td>'
                        ,'<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>'
                        ,'<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>'
                        ,'</td>'
                        ,'</tr>'].join(''));

                    //单个重传
                    tr.find('.demo-reload').on('click', function(){
                        obj.upload(index, file);
                    });

                    //删除
                    tr.find('.demo-delete').on('click', function(){
                        delete files[index]; //删除对应的文件
                        tr.remove();
                        uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
                    });

                    demoListView.append(tr);
                });
            }
            ,allDone: function(obj){
                console.log(obj.total); //得到总文件数
                console.log(obj.successful); //请求成功的文件数
                console.log(obj.aborted); //请求失败的文件数
                if (obj.aborted == 0){
                    $('#testList').addClass('layui-btn-disabled');
                    $('#testListAction').addClass('layui-btn-disabled');
                    $('#TransReport').removeClass('layui-btn-disabled');
                }
            }
            ,done:function(res,index,upload){
                if(res.data){ //上传成功
                    var tr = demoListView.find('tr#upload-'+ index)
                        ,tds = tr.children();
                    tds.eq(2).html('<span style="color: #5FB878;">上传成功</span>');
                    tds.eq(3).html(''); //清空操作
                    return delete this.files[index]; //删除文件队列已经上传成功的文件
                }
                this.error(index, upload);
            }
            ,error: function(index, upload){
                var tr = demoListView.find('tr#upload-'+ index)
                    ,tds = tr.children();
                tds.eq(2).html('<span style="color: #FF5722;">上传失败</span>');
                tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
            }
        });


        //合成下载点击动作
        $('#TransReport').click(function () {
            /*
            var t=$("table tr:eq(1) td:eq(0)").text();
            var rows = $("tr").length;
            alert(t);
            alert(rows);
             */
            /*
            逻辑说明：
            1、对上传表进行判断，查找其中“上传成功”的行，并取出文件名，生成json，传到后台
            2、后台接收到文件名后，对文件进行筛选，然后依次合并、签章、转换pdf
            3、把转换后的pdf直接以流模式加载回前台
            4、前台提供下载功能。
             */
            /*var reportName = "{"
            var rows = $("tr").length;
            for( var i=1;i < rows;i++){
                //alert($("table tr:eq("+ i +") td:eq(2)").text());
                if ($("table tr:eq("+ i +") td:eq(2)").text() == '上传成功'){
                    reportName += "'taskid':'" + $("table tr:eq("+ i +") td:eq(0)").text() + "'";
                    if (i+1 < rows){
                        reportName += ",";
                    }
                }

            }
            reportName += "}";*/

            var reportName = [];
            var rows = $("tr").length;
            for( var i=1;i < rows;i++){
                //alert($("table tr:eq("+ i +") td:eq(2)").text());
                if ($("table tr:eq("+ i +") td:eq(2)").text() == '上传成功'){
                    reportName.push($("table tr:eq("+ i +") td:eq(0)").text());
                }

            }
            //reportName += "}";
            var loading = layer.load(2);
            $.ajax({
                type: "post",
                url: "/lims/processReport",
                data: JSON.stringify(reportName),
                contentType: "application/json;charset=utf-8",
                dataType: "json",
                success: function (res) {
                    layer.close(loading);
                    if (res.status = 200){
                        //layer.alert("转pdf完成");
                        //   /download?imageFile=' + result + '
                        /*$.ajax({
                            type: "GET",
                            url: "/download?imageFile",
                            data: res.file,
                            success: function(result) {
                                //alert("");
                            }
                        });*/
                        $('#TransReport').addClass('layui-btn-disabled');
                        $('#dd').removeClass('layui-btn-disabled');
                        $('#ddd').removeClass('layui-btn-disabled');
                        $("#dd").attr("href","/download?reportFile=" + res.file);
                        //link.click();
                    }else {
                        layer.alert(res.des);
                    }
                }
            });
        });




    });
});
