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
});