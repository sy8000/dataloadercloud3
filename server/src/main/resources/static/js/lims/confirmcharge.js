layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        layer = layui.layer;
    table.render({
        elem: '#confirmChargeTableId',
        url: '/loading/getConfirmChargeData',
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
                {field: 'taskId', title: '任务单号', width: 150},
                {field: 'taskReportedName', title: '任务名称', width: 300},
                {field: 'assignedSampleQuantity', title: '样品数量', width: 100},
                {field: 'conclusion', title: '复核结果', width: 100,},
                {field: 'seqNum', title: '主键', width: 80}
            ]
        ]
    });



    //监听行双击事件
    table.on('rowDouble(confirmChargeTableFilter)', function(obj){
        parent.layer.open({
            type: 2,
            title: '试验结果明细',
            anim: 2,
            area: ['1000px', '600px'],
            resize: false,
            content: "/dlclims/viewcharge?taskId=" + obj.data.taskId
        });
    });


    // 监听搜索操作
    form.on('submit(data-search-btn)', function (data) {
        var result = "{'billno':'"+ $("#taskid").val() +"'}";
        //var result = JSON.stringify(resultvalue);
        console.log(result);
        //执行搜索重载
        table.reload('confirmChargeTableId', {
            page: {
                curr: 1
            }
            , where: {
                keyword: result
            }
        }, 'list');

        return false;
    });



});