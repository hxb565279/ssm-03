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
    <title>错误</title>`
</head>
<body>
<h1>${msg}</h1>
<a href="${pageContext.request.contextPath}/reLogin.action"> 登录</a>
<script>
    alert("账号密码错误");
</script>
</body>
</html>
