<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>
<head>
<title>Adding Customer</title>

<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">






</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Hotel Booking - Application</h2>
		</div>

	</div>


	<div id="containter">
			<form:form action="addCustomer" modelAttribute="customer"
			method="POST">	
			
			<!-- hidden customer id -->		
			
			<form:hidden path="id"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label>
						<td><form:input path="firstname" /></td>
					</tr>

					<tr>
						<td><label>Last Name:</label>
						<td><form:input path="lastname" /></td>
					</tr>

					<tr>
						<td><label>Street:</label>
						<td><form:input path="street" /></td>
					</tr>

					<tr>
						<td><label>City:</label>
						<td><form:input path="city" /></td>
					</tr>

						<tr>
						<td><label>State:</label>
						<td><form:input path="state" /></td>
					</tr>
					
					<tr>
						<td><label>Zip:</label>
						<td><form:input path="zip" /></td>
					</tr>

					<tr>
						<td><label>Email: </label>
						<td><form:input path="email" /></td>
					</tr>

					<tr>
						<td><label>Phone Number: </label>
						<td><form:input path="phone" /></td>
					</tr>
					<tr>
						<td><label>Payment Method: </label>
						<td><form:input path="payment" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>

					</tr>
				</tbody>
			</table>
		</form:form>
	<div style="clear"; both;></div>
		<p>
			<a href="${pageContext.request.contextPath }/customer/Home">Back to Home</a>

	</div>
</body>



</html>