<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/12
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="../css/form.css">
    <style>
        body{
            background-image: url("../images/天空1.jpg");
        }
    </style>
</head>
<body>
<%--<a href="${pageContext.request.contextPath}/ /text.action">--%>
<%--    111--%>
<%--</a>--%>
<form action="${pageContext.request.contextPath}/login.action"
      method="post" onsubmit="return true"  class="login_form1">
    <div style="text-align: center;" class="login_form2">
        <label >登录</label><br>
        <label> 账&nbsp;号：<input  type="text" name="username"/></label>
        <br/><br/>
        <label>密&nbsp;码：<input type="password" name="password"/><br></label>
        <br>
        <input type="submit" value="登录" />
        <input type="button" value="注册" onclick="window.location.href='${pageContext.request.contextPath}/reRegister.action'">
    </div>
</form>
</body>
</html>
