<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Order</title>
<link href="../main.css" rel="stylesheet" type="text/css">

</head>
<body>
	<h1>Show Orders</h1>
		<c:forEach items="${orders}" var="order">
			<table>
				<tr>
					<th>Quantity</th>
					<th>Order Date</th>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Product ID</th>
					<th>Description</th>
				</tr>
				
				<tr>
					<td>${order.qty}</td>
					<td>${order.orderDate}</td>
					<td>${order.cust.cId}</td>
					<td>${order.cust.cName}</td>
					<td>${order.prod.pId}</td>
					<td>${order.prod.pDesc}</td>
				</tr>
						
			</table>
		</c:forEach>
		
	<br>
	<a href="/">Home</a><br>
	<a href="/addOrder">Add Orders</a><br>
	<a href="/showProducts">List Product</a><br>
	<a href="/showCustomers">List Customers</a>
</body>
</html>