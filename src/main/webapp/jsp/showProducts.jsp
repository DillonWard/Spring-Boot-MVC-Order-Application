<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Product</title>
<link href="../main.css" rel="stylesheet" type="text/css">

</head>
<body>
	<h1>Show Products</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Description</th>
			<th>Quantity</th>
		</tr>
		
		<tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.pId}</td>
					<td>${product.pDesc}</td>
					<td>${product.qtyInStock}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	<a href="/">Home</a><br>
	<a href="/addProduct">Add Product</a><br>
	<a href="/showCustomers">List Customers</a><br>
	<a href="/showOrders">List Orders</a>
</body>
</html>