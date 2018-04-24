<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Home</title>

<!-- css reference below -->



</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Hotel Booking - Application</h2>
		</div>
	</div>

	<div id="container">
</body>
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

	<!-- add new room button  -->
	<input type="button" value="Add Room"
		onclick="window.location.href='AddCustomerForm'; return false;"
		class="add-button" />


	<!-- manage customers button -->
	<input type="button" value="Manage Customers"
		onclick="window.location.href='ManageCustomers'; return false;"
		class="manage-button" />

	<!-- search button and box below nav buttons -->


	<form:form action="search" method="POST">
		Search:<input type="text" placeholder="Search..." name="theSearchName" />
		<input type="submit" value="Search" class="manage-button" />
	</form:form>

	<table>
		<tr>
			<th>Customer Id:</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Room Type</th>
			<th>Room Service</th>



		</tr>

		<c:forEach var="tempCustomer" items="${customers }">

			<!--  constructing an update link with customer id-->


			<tr>
				<td>${temp2Customer.id }</td>
				<td>${temp2Customer.firstname }</td>
				<td>${temp2Customer.lastname }</td>
				<td>${temp2Customer.roomtype }</td>
				<td>${temp2Customer.roomservice }</td>

				<td>
					<!-- displaying update link --> <c:url var="updateLink"
						value="/customer/UpdateManageCustomers">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url> <input type="button" value="Update"
					onclick="window.location.href='${updateLink}'"> <!--  constructing a delete link with customer id-->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url> <input type="button" value="Delete"
					onclick="if (confirm('Are you sure you want to remove this customer?')) window.location.href='${deleteLink}';" />
			</tr>

		</c:forEach>
	</table>


</div>
</div>

</body>

</html>
