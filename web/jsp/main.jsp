<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/12
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script src="../js/js/vue.js" charset="UTF-8" type="text/javascript"></script>
    <script src="../js/js/vue.min.js" charset="UTF-8" type="text/javascript"></script>
</head>
<body>
<div id="app1" >
    <p >{{message}}</p>
</div>
<script type="text/javascript">
    new Vue({
        el:'#app1',
        data: {
            message:"青岛"
    }
    })
</script>

</body>
</html>
