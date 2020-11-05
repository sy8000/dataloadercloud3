layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        util = layui.util,
        layer = layui.layer;
    let radiocheck = '';
    table.render({
        elem: '#sampleReceiveId',
        url: '/loading/sampleReceive',
        method: 'get',
        width: '95%',
        //toolbar: '#toolbarDemo',
        //toolbar: 'default',
        totalRow: true, //开启合计行
        height: 'full-200',
        cellMinWidth: 50,
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
        /*parseData: function(res){ //将原始数据解析成 table 组件所规定的数据，res为从url中get到的数据
            console.log(res);
        },*/
        /*defaultToolbar: ['filter', 'exports', 'print'],*/
        cols: [
            [{type: 'radio', fixed: 'left'}
                , {
                field: 'project', title: '委托单号', width: 200, sort: true, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.project + '</div>'
                }
            }
                , {
                field: 'createdate', title: '创建日期', width: 180, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.createdate + '</div>'
                }
            }
                , {
                field: 'customer', title: '联系人', width: 100, sort: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.customer + '</div>'
                }
            }
                , {
                field: 'phone', title: '联系电话', width: 120, templet: function (d) {
                    return '<div style = "text-align:left">' + d.phone + '</div>'
                }
            }
                , {
                field: 'template', title: '委托类型', width: 100, templet: function (d) {
                    return '<div style = "text-align:left">' + d.template + '</div>'
                }
            }
                , {
                field: 'sourcecustomer', title: '付费单位', width: 200, templet: function (d) {
                    return '<div style = "text-align:left">' + d.sourcecustomer + '</div>'
                }
            }
                , {
                field: 'reportname', title: '产品类型', width: 130, templet: function (d) {
                    return '<div style = "text-align:left">' + d.reportname + '</div>'
                }
            }
            ]
        ],
        limit: 10,
        limits: [10, 20, 30, 40, 50],
        page: true
        //skin: 'line',
        //size:'lg',
        //even: true
    });

    /**监听radio***/
    table.on('radio(sampleReceiveFilter)', function(obj){
        //console.log(obj);
        radiocheck = obj.data.project;
        console.log('新radio选择:' + radiocheck);
        $('#receiveBtnId').removeAttr("disabled");
        $('#rejectBtnId').removeAttr("disabled");
        $('#receiveBtnId').removeClass("layui-btn-disabled");
        $('#rejectBtnId').removeClass("layui-btn-disabled");
    });

    /**样品接收按钮**/
    $("#receiveBtnId").click(function(){
        $("#receiveBtnId").addClass("layui-btn-disabled");
        $("#receiveBtnId").attr("disabled", true);
        //layer.msg('选中了委托单：' + radiocheck);
        parent.layer.open({
            type: 2,
            title: '库位选择',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlclims/receive?projno=" + radiocheck
        });
    });



    // 监听搜索操作
    form.on('submit(data-search-btn)', function (data) {
        var result = "{'project':'"+ $("#projno").val() +"'}";
        //var result = JSON.stringify(resultvalue);
        console.log(result);
        //执行搜索重载
        table.reload('sampleReceiveId', {
            page: {
                curr: 1
            }
            , where: {
                keyword: result
            }
        }, 'list');

        return false;
    });

    //监听行双击事件
    table.on('rowDouble(sampleReceiveFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '样品信息预览',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlclims/viewsample?project=" + obj.data.project,
            btn: '关闭全部',
            btnAlign: 'c',
            yes:function () {
                parent.layer.closeAll();
            }
        });
    });






});