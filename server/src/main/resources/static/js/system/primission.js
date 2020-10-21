layui.use(['form', 'table','layer','laydate'], function () {
    var $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        util = layui.util,
        layer = layui.layer,
        laydate = layui.laydate;
    table.render({
        elem: '#currentTableId',
        url: '/loading/dataloaderpermission',
        method: 'get',
        width: '95%',
        //toolbar: '#toolbarDemo',
        toolbar: 'default',
        totalRow: true , //开启合计行
        request: {
            pageName: 'page' //页码的参数名称，默认：page
            , limitName: 'limit' //每页数据量的参数名，默认：limit
        },
        response: {
            statusName: 'code' //数据状态的字段名称，默认：code
            , statusCode: 0 //成功的状态码，默认：0
            , countName: 'totals' //数据总数的字段名称，默认：count
            , dataName: 'list' //数据列表的字段名称，默认：data
        },
        defaultToolbar: ['filter', 'exports', 'print'/*, {
                    title: '报告导出',
                    layEvent: 'LAYTABLE_TIPS',
                    icon: 'layui-icon-tips'
                }*/
        ],
        cols: [
            [   {type: 'checkbox', fixed: 'left'}
                ,{field: 'permissionid', title: 'ID', width: 220, sort: true ,align:'center',templet:function(d){ return '<div style = "text-align:left">'+d.permissionid+'</div>'},hide:true }
                , {field: 'name', title: '权限名', width: 170 ,align:'center',templet:function(d){ return '<div style = "text-align:left">'+d.name+'</div>'}}
                , {field: 'permission', title: '权限编码', width: 120, sort: true,templet:function(d){ return '<div style = "text-align:left">'+d.permission+'</div>'}}
                , {field: 'url', title: '权限url', width: 170,templet:function(d){ return '<div style = "text-align:left">'+d.url+'</div>'}}
                , {field: 'vdef1', title: '自定义1',  width: 80 ,hide:true,templet:function(d){ return '<div style = "text-align:left">'+d.vdef1+'</div>'}}
                , {field: 'vdef2', title: '自定义2',  width: 80 ,hide:true,templet:function(d){ return '<div style = "text-align:left">'+d.vdef2+'</div>'}}
                , {field: 'vdef3', title: '自定义3',  width: 80 ,hide:true,templet:function(d){ return '<div style = "text-align:left">'+d.vdef3+'</div>'}}
                , {field: 'vdef4', title: '自定义4', width: 80 ,hide:true,templet:function(d){ return '<div style = "text-align:left">'+d.vdef4+'</div>'}}
                , {field: 'vdef5', title: '自定义5', width: 80 ,hide:true,templet:function(d){ return '<div style = "text-align:left">'+d.right+'</div>'}}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]
        ],
        limit: 10,
        limits: [10, 20, 30, 40, 50],
        page: true,
        //skin: 'line',
        size:'lg',
        even: true

    });


    //监听头工具栏事件
    table.on('toolbar(currentTableFilter)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id)
            ,data = checkStatus.data; //获取选中的数据
        switch(obj.event){
            case 'add':
                //Ajax获取
                /*var str = '';
                $.post('/dlcsystem/addeditpermission', {},
                    function(str){
                    layer.open({
                        type: 2,
                        title: '权限维护',
                        anim: 2,
                        area: ['500px', '300px'],
                        resize: false,
                        content: str, //注意，如果str是object，那么需要字符拼接。
                    });
                });*/
                parent.layer.open({
                    type: 2,
                    title: '权限维护',
                    anim: 2,
                    area: ['1000px', '500px'],
                    resize: false,
                    content: "/dlcsystem/addpermission", //注意，如果str是object，那么需要字符拼接。
                    btn: '关闭全部',
                    btnAlign: 'c',
                    yes:function () {
                        parent.layer.closeAll();
                    }
                });
                break;
            case 'update':
                if(data.length === 0){
                    layer.msg('请选择一行');
                } else if(data.length > 1){
                    layer.msg('只能同时编辑一个');
                } else {
                    layer.alert('编辑 [permissionid]：'+ checkStatus.data[0].permissionid);
                }
                break;
            case 'delete':
                if(data.length === 0){
                    layer.msg('请选择一行');
                } else {
                    layer.msg('删除');
                }
                break;
        };
    });


    //监听行工具事件
    table.on('tool(currentTableFilter)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
        var data = obj.data //获得当前行数据
            ,layEvent = obj.event; //获得 lay-event 对应的值
        if(layEvent === 'detail'){
            layer.msg('查看操作');
        } else if(layEvent === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del(); //删除对应行（tr）的DOM结构
                layer.close(index);
                //向服务端发送删除指令
            });
        } else if(layEvent === 'edit'){
            layer.msg('编辑操作');
        }
    });


    // 监听搜索操作
    /*form.on('submit(data-search-btn)', function (data) {
        //var result = JSON.stringify(data.field);
        //layer.alert(data.field);
        /!*var resultvalue = [];
    resultvalue.push($("#createDate").val());
    resultvalue.push($("#testName").val());
    resultvalue.push($("#testGroup").val());
    resultvalue.push($("#maker").val());
    resultvalue.push($("#taskid").val());
    var result = JSON.stringify(resultvalue);*!/
        var result = "{'createDate':'" + $("#createDate").val() + "',";
        result += "'testName':'" + $("#testName").val() + "',";
        result += "'testGroup':'" + $("#testGroup").val() + "',";
        result += "'maker':'" + $("#maker").val() + "',";
        result += "'taskid':'" + $("#taskid").val() + "'}";
        //var result = JSON.stringify(resultvalue);
        console.log(result);
        //执行搜索重载
        table.reload('currentTableId', {
            page: {
                curr: 1
            }
            , where: {
                keyword: result
            }
        }, 'list');

        return false;
    });*/
});