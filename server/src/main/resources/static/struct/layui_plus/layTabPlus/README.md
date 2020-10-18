# 一、简介
layTabPlus是一个layUI后台Tab布局框架的扩展插件，实现了Tab管理、刷新按钮、iframe优化等功能。

项目地址：[https://gitee.com/Leytton/layTabPlus](https://gitee.com/Leytton/layTabPlus)
Demo演示：[http://leytton.gitee.io/laytabplus](http://leytton.gitee.io/laytabplus)

效果截图：
( [ThinkJDBC](https://gitee.com/Leytton/ThinkJD) 经历了多次蜕变后,已经成为一个很不错的项目，请给它一次机会 :laughing: )
![效果截图](https://gitee.com/uploads/images/2018/0527/161730_9b42ef49_890966.png "效果截图.png")

# 二、特性
- 添加刷新按钮
- 美化部分css样式
- 支持iframe跨域刷新
- 自动调整iframe高度
- 禁止iframe父窗口跳转模式
- 可设置静态不允许关闭的模块

# 三、使用方法
### 首先引入js文件
```
<script src="https://leytton.gitee.io/laytabplus/js/layTabPlus.js"></script>
```
## 初始化方法
```
layTabPlus.init({lay_filter: 'demoTab'});
```

1、在DOM元素上添加`class="layTabPlus"`和`tab_url="iframe地址"`即可，调用初始化方法会自动绑定点击事件。点击时自动获取该元素的`innerHTML`作为标题。如:
```
<a href="javascript:;" class="layTabPlus" tab_url="http://www.baidu.com">百度</a>
```


2、也可以直接调用方法`layTabPlus.addTab()`添加

(1)、指定url `addTab(url[,title])` //第一个参数是url地址

(2)、传入DOM元素`addTab(this)`,处理方式参考方法一

# 四、相关设置
## (1) 禁止iframe跳转(默认禁止跳转)
全局设置:

```
layTabPlus.init({
	lay_filter: 'demoTab'，
	tab_jump:false
});
```
局部设置:
```
<a href="javascript:;" class="layTabPlus" tab_jump="false" tab_url="http://www.baidu.com" >百度</a>
```

## (2)静态模块不允许关闭
参考demo代码 添加`noclose`样式即可
```
<li class="layui-this noclose" lay-id='base_info'>基本信息</li>
```

# 五、开源协议
Apache License 2.0 请放心食用:)