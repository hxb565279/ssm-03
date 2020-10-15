<%@ page import="com.hxb.po.Order" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hxb.controller.OrderController" %><%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/15
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>主页</h1>
<% OrderController orderController = new OrderController();
    Order allOrder = orderController.findAllOrder();
%>
<tr>
<td>
    <%=allOrder.getOrderid()%>
    <%=allOrder.getOrdusername()%>
    <%=allOrder.getOrdadress()%>
    <%=allOrder.getOrdphone()%>
    <%=allOrder.getOrdnumber()%>
</td>
</tr>
</body>
</html>
