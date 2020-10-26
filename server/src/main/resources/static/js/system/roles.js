layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;
    table.render({
        elem: '#rolesTableId',
        url: '/loading/dataloaderrole',
        toolbar: 'default',
        limit: 10,
        limits: [10, 20, 30, 40, 50],
        page: true,
        height: 'full-200',
        cellMinWidth: 50,
        response: {
            statusName: 'code' //数据状态的字段名称，默认：code
            , statusCode: 0 //成功的状态码，默认：0
            , countName: 'totals' //数据总数的字段名称，默认：count
            , dataName: 'list' //数据列表的字段名称，默认：data
        },
        defaultToolbar: ['filter', 'exports', 'print'],
        cols: [
            [
                {type: 'checkbox', fixed: 'left'},
                {field: 'roleid', title: '角色ID', width: 200 },
                {field: 'available', title: '角色状态', width: 200 },
                {field: 'description', title: '角色描述', width: 200 },
                {field: 'rolename', title: '角色名称', width: 200 },
                {field: 'vdef1', title: '备用1', width: 200 , hide: true},
                {field: 'vdef2', title: '备用2', width: 200 , hide: true},
                {field: 'vdef3', title: '备用3', width: 200 , hide: true},
                {field: 'vdef4', title: '备用4', width: 200 , hide: true},
                {field: 'vdef5', title: '备用5', width: 200 , hide: true}
            ]
        ]
    });




    //监听头工具栏事件
    table.on('toolbar(rolesTableFilter)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id)
            ,data = checkStatus.data; //获取选中的数据
        switch(obj.event){
            case 'add':
                parent.layer.open({
                    type: 2,
                    title: '角色维护',
                    anim: 2,
                    area: ['1000px', '500px'],
                    resize: false,
                    content: "/dlcsystem/addrole", //注意，如果str是object，那么需要字符拼接。
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
                        title: '角色编辑',
                        anim: 2,
                        area: ['1000px', '500px'],
                        resize: false,
                        content: "/dlcsystem/editrole?roleid=" + checkStatus.data[0].roleid,
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
                        url: "/action/delrole?roleid=" + checkStatus.data[0].roleid,
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
    table.on('rowDouble(rolesTableFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '权限预览',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlcsystem/viewrole?roleid=" + obj.data.roleid,
            btn: '关闭全部',
            btnAlign: 'c',
            yes:function () {
                parent.layer.closeAll();
            }
        });
    });




});