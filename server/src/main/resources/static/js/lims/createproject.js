layui.use([ 'form', 'step','element', 'layer'], function () {
    var $ = layui.$,
        form = layui.form,
        element = layui.element;
        layer = layui.layer
        step = layui.step;




    step.render({
        elem: '#stepForm',
        filter: 'stepForm',
        width: '100%', //设置容器宽度
        stepWidth: '95%',
        height: '100%',
        stepItems: [{
            title: '填写委托单信息'
        }, {
            title: '单据预览'
        }, {
            title: '提交审核'
        }]
    });


    form.on('submit(formStep)', function (data) {
        step.next('#stepForm');
        return false;
    });

    form.on('submit(formStep2)', function (data) {
        step.next('#stepForm');
        return false;
    });

    $('.pre').click(function () {
        step.pre('#stepForm');
    });

    $('.next').click(function () {
        step.next('#stepForm');
    });
})