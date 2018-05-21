 <html>
<body>
<script type="text/javascript" charset="utf-8" src="ueditor1_4_3/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor1_4_3/ueditor.all.min.js"> </script>
    建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败
    这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文
    <script type="text/javascript" charset="utf-8" src="ueditor1_4_3/lang/zh-cn/zh-cn.js"></script>
<h2>Hello World!</h2>
<a href="login/requestMapping.do?username=111&age=11">requestMapping</a><BR/><BR/>


<a href="login/testPathVariable/1">requestMapping11</a></br>


 <script id="editor" type="text/plain" style="width:1024px;height:500px;"/>

<form action ="login/testModelAttribute.do" method="post">
	<input type="hidden" name="id" value="1"/>
	userName:<input type="text" name="userName" value="tom"/></br>
	passWord:<input type="text" name="passWord" value="123456"/></br>
	age:<input type="text" name="age" value="12"/></br>
	<input type="submit" value="submit"/>
</form>

</body>
</html>

 
 