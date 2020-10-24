layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;
    table.render({
        elem: '#projSampleLoginTableId',
        url: '/loading/getselectbymodule',
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
        cols: [
            [
                {field: 'project', title: '委托单号', width: 150},
                {field: 'prodname', title: '规格型号', width: 200},
                {field: 'otherReq', title: '中文其它信息', width: 200},
                {field: 'enOtherReq', title: '英文其它信息', width: 200,},
                {field: 'seqNum', title: '主键', width: 80}
            ]
        ]
    });



    //监听行双击事件
    table.on('rowDouble(projSampleLoginTableFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '委托单变更',
            anim: 2,
            area: ['1000px', '500px'],
            resize: false,
            content: "/dlcsystem/editproject?seqNum=" + obj.data.seqNum
        });
    });



});