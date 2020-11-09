layui.use(['form', 'table','layer'], function () {
    let $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        util = layui.util,
        layer = layui.layer;
    let radiocheck;
    table.render({
        elem: '#receiveId',
        url: '/loading/receiveConfirm',
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
                field: 'name', title: '库位号', width: 100, sort: true, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.name + '</div>'
                }
            }
                , {
                field: 'locationNumber', title: '库位键值', width: 180, align: 'center', templet: function (d) {
                    return '<div style = "text-align:left">' + d.locationNumber + '</div>'
                }
            }
                , {
                field: 'hierarchy', title: '库位信息', width: 400, sort: true, templet: function (d) {
                    return '<div style = "text-align:left">' + d.hierarchy + '</div>'
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
    table.on('radio(receiveFilter)', function(obj){
        console.log(obj);
        radiocheck = obj.data.locationNumber;
        console.log('radio选择:' + radiocheck);
        $('#confirmReceiveBtn').removeAttr("disabled");
        $('#confirmReceiveBtn').removeClass("layui-btn-disabled");
    });

    /**监听接收按钮***/
    $('#confirmReceiveBtn').click(function () {
        let projno=$("#projno").val();
        console.log('隐藏域值:' + projno);
        //let json = '{"project":"'+ projno +'","locationNumber":"'+ radiocheck +'"}';
        //console.log(json)
        /*let json = [];
        json.push(projno);
        json.push(radiocheck);*/
        $.ajax({
            url: "/limsaction/getSample",
            type: 'post',
            contentType: "application/json",
            data: JSON.stringify({"project": projno ,"locationNumber":radiocheck }),
            success: function(result) {
                if (result.code == 200){
                    parent.layer.closeAll();
                    parent.layer.msg('接收成功');
                    /*
                    checkStatus.data[0].del();
                    console.log(obj);
                    console.log(data[0]);
                     */
                }else {
                    layer.msg('接收失败');
                }
            }
        })
    });





    // 监听搜索操作
    form.on('submit(data-search-btn)', function (data) {
        var result = "{'name':'"+ $("#name").val() +"'}";
        //var result = JSON.stringify(resultvalue);
        console.log(result);
        //执行搜索重载
        table.reload('receiveId', {
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