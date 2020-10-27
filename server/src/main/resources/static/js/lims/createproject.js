layui.use([ 'form', 'step'], function () {
    var $ = layui.$,
        form = layui.form,
        step = layui.step;

    step.render({
        elem: '#stepForm',
        filter: 'stepForm',
        width: '100%', //设置容器宽度
        stepWidth: '750px',
        height: '100%',
        stepItems: [{
            title: '委托单基本信息'
        }, {
            title: '试验及样品信息维护'
        }, {
            title: '完成'
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