<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 16/11/30
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
    <a href="queryCustomers.action">Query Customers</a><br/>
    <a href="queryOrders.action">Query Orders</a><br/>
    <form action="queryCustomersById.action" method="post">
      <input type="text" name="customerID" value="CustomerID"/>
      <input type="submit" value="submit"/>
    </form>
  </body>
</html>
