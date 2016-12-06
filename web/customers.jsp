<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 16/11/30
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
    <table>
        <s:iterator value="#session.customer" id="cs" status="st">
            <tr>
                <td><s:property value="#cs.customerID"></s:property></td>
                <td><s:property value="#cs.companyName"></s:property></td>
                <td><s:property value="#cs.contactTitle"></s:property></td>
                <td><s:property value="#cs.contactName"></s:property></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
