<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/13
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/form.css">
</head>
<body>
<form action="${pageContext.request.contextPath }/login.action"
      method="post"  class="login_form1">
    <div style="text-align: center;" class="login_form2">
        <label >注册</label><br>
        <label> 账&nbsp;号：<input  type="text" name="username"/></label>
        <br/><br/>
        <label>密&nbsp;码：<input type="password" name="password"/><br></label>
        <br>
        <input type="submit" value="注册" onsubmit="return true"/>
        <input type="button" value="登录" onclick="window.open('./login.jsp')">
    </div>
</form>

</body>
</html>
