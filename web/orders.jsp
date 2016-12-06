<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 16/11/30
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Orders</title>
</head>
<body>
<table>
    <s:iterator value="#session.order" id="cs" status="st">
        <tr>
            <td><s:property value="#cs.orderID"></s:property></td>
            <td><s:property value="#cs.customerID"></s:property></td>
            <td><s:property value="#cs.orderDate"></s:property></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
