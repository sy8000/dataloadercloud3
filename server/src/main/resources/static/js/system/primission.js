layui.use(['form', 'table','layer'], function () {
    var $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        util = layui.util,
        layer = layui.layer;
    table.render({
        elem: '#currentTableId',
        url: '/loading/dataloaderpermission',
        method: 'get',
        width: '95%',
        //toolbar: '#toolbarDemo',
        toolbar: 'default',
        totalRow: true, //开启合计行
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
        defaultToolbar: ['filter', 'exports', 'print'],
        cols: [
            [{type: 'checkbox', fixed: 'left'}
                , {
                field: 'permissionid', title: 'ID', width: 220, sort: true, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.permissionid + '</div>'
                }, hide: true
            }
                , {
                field: 'name', title: '权限名', width: 200, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.name + '</div>'
                }
            }
                , {
                field: 'permission', title: '权限编码', width: 180, sort: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.permission + '</div>'
                }
            }
                , {
                field: 'url', title: '权限url', width: 200, templet: function (d) {
                    return '<div style = "text-align:left">' + d.url + '</div>'
                }
            }
                , {
                field: 'vdef1', title: '自定义1', width: 80, hide: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.vdef1 + '</div>'
                }
            }
                , {
                field: 'vdef2', title: '自定义2', width: 80, hide: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.vdef2 + '</div>'
                }
            }
                , {
                field: 'vdef3', title: '自定义3', width: 80, hide: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.vdef3 + '</div>'
                }
            }
                , {
                field: 'vdef4', title: '自定义4', width: 80, hide: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.vdef4 + '</div>'
                }
            }
                , {
                field: 'vdef5', title: '自定义5', width: 80, hide: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.right + '</div>'
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




    //监听头工具栏事件
    table.on('toolbar(currentTableFilter)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id)
            ,data = checkStatus.data; //获取选中的数据
        switch(obj.event){
            case 'add':
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
                    //layer.alert('编辑 [permissionid]：'+ checkStatus.data[0].permissionid);
                    parent.layer.open({
                        type: 2,
                        title: '权限编辑',
                        anim: 2,
                        area: ['1000px', '500px'],
                        resize: false,
                        content: "/dlcsystem/editpermission?dlpermissionid=" + checkStatus.data[0].permissionid,
                        btn: '关闭全部',
                        btnAlign: 'c',
                        yes:function () {
                            parent.layer.closeAll();
                        }
                    });
                }
                break;
            case 'delete':
                if(data.length === 0){
                    layer.msg('请选择一行');
                } else {
                    //layer.msg('删除');
                    $.ajax({
                        url: "/action/delpermission?dlpermissionid=" + checkStatus.data[0].permissionid,
                        type: 'delete',
                        contentType:"application/json",
                        success: function(data) {
                            if (data.code == 200){
                                layer.msg('删除成功');
                                obj.del();
                            }else {
                                layer.msg('删除失败');
                            }
                        }
                    })
                }
                break;
        };
    });

    //监听行双击事件
    table.on('rowDouble(currentTableFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '权限预览',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlcsystem/viewpermission?dlpermissionid=" + obj.data.permissionid,
            btn: '关闭全部',
            btnAlign: 'c',
            yes:function () {
                parent.layer.closeAll();
            }
        });
    });






});