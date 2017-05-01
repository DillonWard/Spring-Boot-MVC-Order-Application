<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Order</title>
</head>
<body>
	<h1>Add Order</h1>
	
	<form:form modelAttribute="order1">
		<table>
			<tr>
				<td>Customer ID:</td>
				<td><form:input path="cust.cId"></form:input></td>
			</tr>
			<tr>
				<td>Product ID:</td>
				<td><form:input path="prod.pId"></form:input></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><form:input path="qty"></form:input></td>
				<td><form:errors path="qty"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Order" /></td>
			</tr>
		</table>	
	</form:form>
		
	<a href="/">Home</a><br>
	<a href="/showOrders">List Orders</a><br>
	<a href="/showProducts">List Product</a><br>
	<a href="/showCustomers">List Customers</a>
	
</body>
</html>