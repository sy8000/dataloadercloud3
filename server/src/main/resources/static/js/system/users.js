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
            response: {
                statusName: 'code' //数据状态的字段名称，默认：code
                , statusCode: 0 //成功的状态码，默认：0
                , countName: 'totals' //数据总数的字段名称，默认：count
                , dataName: 'list' //数据列表的字段名称，默认：data
            },
            cols: [
                [
                    {type: 'checkbox', fixed: 'left'},
                    {field: 'cuserid', title: '用户ID', width: 210},
                    {field: 'userCode', title: '用户工号', width: 100},
                    {field: 'userName', title: '用户名称', width: 150},
                    {field: 'email', title: 'E-mail', width: 200},
                    {field: 'islocked', title: '是否锁定', width: 100, }
                ]
            ]
    });

        //添加用户按钮点击
    $("#adduserbtn").click(function () {

    });
        //编辑用户按钮点击
    $("#edituserbtn").click(function () {

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

    });

});