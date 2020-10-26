
layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;
        table.render({
            elem: '#usersTableId',
            url: '/loading/dataloaderuser',
            limit: 10,
            limits: [10, 20, 30, 40, 50],
            page: true,
            toolbar: 'default',
            defaultToolbar: ['filter', 'exports', 'print'],
            height: 'full-200',
            cellMinWidth: 50,
            response: {
                statusName: 'code' //数据状态的字段名称，默认：code
                , statusCode: 0 //成功的状态码，默认：0
                , countName: 'totals' //数据总数的字段名称，默认：count
                , dataName: 'list' //数据列表的字段名称，默认：data
            },
            cols: [
                [
                    {type: 'checkbox', fixed: 'left' },
                    {field: 'cuserid', title: '用户ID', width: 210},
                    {field: 'userCode', title: '用户工号', width: 100},
                    {field: 'userName', title: '用户名称', width: 150},
                    {field: 'email', title: 'E-mail', width: 200},
                    {field: 'islocked', title: '是否锁定', width: 100, }
                ]
            ]
    });

    //监听头工具栏事件
    table.on('toolbar(usersTableFilter)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id)
            ,data = checkStatus.data; //获取选中的数据
        switch(obj.event){
            case 'add':
                parent.layer.open({
                    type: 2,
                    title: '用户维护',
                    anim: 2,
                    area: ['1000px', '500px'],
                    resize: false,
                    content: "/dlcsystem/adduser"
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
                        title: '用户编辑',
                        anim: 2,
                        area: ['1000px', '500px'],
                        resize: false,
                        content: "/dlcsystem/edituser?cuserid=" + checkStatus.data[0].cuserid,
                    });
                }
                break;
            case 'delete':
                if(data.length === 0){
                    layer.msg('请选择一行');
                } else {
                    //layer.msg('删除');
                    $.ajax({
                        url: "/action/deluser?cuserid=" + checkStatus.data[0].cuserid,
                        type: 'delete',
                        contentType:"application/json",
                        success: function(result) {
                            if (result.code == 200){
                                layer.msg('删除成功');
                                checkStatus.data[0].del();
                                console.log(obj);
                                console.log(data[0]);
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
    table.on('rowDouble(usersTableFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '用户预览',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlcsystem/viewuser?cuserid=" + obj.data.cuserid
        });
    });




    /*
            //添加用户按钮点击
        $("#adduserbtn").click(function () {
            parent.layer.open({
                type: 2,
                title: '用户添加',
                anim: 2,
                area: ['1000px', '500px'],
                resize: false,
                content: "/dlcsystem/adduser", //注意，如果str是object，那么需要字符拼接。
            });
        });
            //编辑用户按钮点击
        $("#edituserbtn").click(function () {
            parent.layer.open({
                type: 2,
                title: '角色编辑',
                anim: 2,
                area: ['1000px', '500px'],
                resize: false,
                content: "/dlcsystem/edituser?cuserid=" + selectedData.cuserid
            });
        });
            //删除用户按钮点击
        $("#deluserbtn").click(function () {

        });
            //用户授权按钮点击
        $("#grantuserbtn").click(function () {

        });
            //查询用户按钮点击
        $("#searchuserbtn").click(function () {

        });
            //导出用户按钮点击
        $("#exprotuserbtn").click(function () {

        });*/

});