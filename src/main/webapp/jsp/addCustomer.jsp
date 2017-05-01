<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Customer</title>
</head>
<body>
	<h1>Add Customer</h1>
	
	<form:form modelAttribute="customer1">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="cName"></form:input></td>
				<td><form:errors path="cName"></form:errors></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add Customer"/></td>
			</tr>
		</table>
	</form:form>
	<a href="/">Home</a><br>
	<a href="/showCustomers">List Customers</a><br>
	<a href="/showProducts">List Products</a><br>
	<a href="/showOrders">List Orders</a>
</body>
</html>