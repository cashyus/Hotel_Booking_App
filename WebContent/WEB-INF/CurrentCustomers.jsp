
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>HB - Current Customers</title>

<!-- css reference below -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">




</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Hotel Booking - Application</h2>
		</div>
	</div>



	<div id="content">

		<!--  Home button -->
		<input type="button" value="Home"
			onclick="window.location.href='WelcomeHome'; return false;"
			class="home-button" />

		<!-- Current Customers -->
		<input type="button" value="Current Customers"
			onclick="window.location.href='CurrentCustomers'; return false;"
			class="current-button" />

		<!-- add new customer button  -->
		<input type="button" value="Add Customer"
			onclick="window.location.href='AddCustomerForm'; return false;"
			class="add-button" />
			
		<!-- add new customer button  -->
		<input type="button" value="Add Room"
			onclick="window.location.href='AddCustomerForm'; return false;"
			class="add-button" />

		<!-- manage customers button 	 -->
		<input type="button" value="Manage Customers"
			onclick="window.location.href='ManageCustomers'; return false;"
			class="manage-button" />

		<div align="right">
			<!-- search button and box below nav buttons -->
			<form:form action="search" method="POST">
		Search:<input type="text" placeholder="Search..." name="theSearchName" />
				<input type="submit" value="Search" class="currencustomer-button" />

			</form:form>
		</div>
		<p></p>
		<table>
			<tr>
				<th>Customer Id:</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Room Type</th>
				<th>Room Service</th>


			</tr>

			<c:forEach var="temp2Customer" items="${customers }">

				<!--  constructing an update link with customer id-->


				<tr>
					<td>${temp2Customer.id }</td>
					<td>${temp2Customer.firstname }</td>
					<td>${temp2Customer.lastname }</td>
					<td>${temp2Customer.roomtype }</td>
					<td>${temp2Customer.roomservice }</td>

				</tr>

			</c:forEach>
		</table>


	</div>


</body>

</html>
