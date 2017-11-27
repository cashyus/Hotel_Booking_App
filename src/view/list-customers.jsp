<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>

<title>CurrentCustomers</title>

<!-- css reference below -->
<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css">


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


				
	<!-- add new customer button  -->
			<input type="button" value="Add Booking"
				onclick="window.location.href='AddCustomerForm'; return false;"
				class="add-button" />


	<!-- manage booking button 	 -->
		<input type="button" value= "Manage Booking"
			onlick="window.location.href='ManageBookingForm'; return false;"
			class = "manage-button"/>
			
	<!-- search button and box below nav buttons -->
	<form:form action="search" method="POST">
		Search:<input type="text" name="theSearchName"/>
	<input type="submit" value="Search" class="add-button"/>
	</form:form>

	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Street</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Payment Method</th>
			<th>Update</th>

		</tr>

		<c:forEach var="tempCustomer" items="${customers }">
		
		<!--  constructing an update link with customer id-->

				


	
			
			<tr>
				<td>${tempCustomer.firstname }</td>
				<td>${tempCustomer.lastname }</td>
				<td>${tempCustomer.street }</td>
				<td>${tempCustomer.city }</td>
				<td>${tempCustomer.state }</td>
				<td>${tempCustomer.zip }</td>
				<td>${tempCustomer.email }</td>
				<td>${tempCustomer.phone }</td>
				<td>${tempCustomer.payment }</td>
				
				<td>
			<!-- displaying update link -->
				<c:url var="updateLink" value="/customer/ManageCustomerForm">
				<c:param name="customerId" value="${tempCustomer.id}"/>
				</c:url>
					
			<input type="button" value="Update"
			onclick="window.location.href='${updateLink}'">
				
				
		<!--  constructing a delete link with customer id-->
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${tempCustomer.id}"/>
				</c:url>
				
				
				
				<input type="button" value="Delete" 
				onclick="if (confirm('Are you sure you want to delete your post?')) window.location.href='${deleteLink}';"/>
					
					
				
				

			</tr>

		</c:forEach>
	</table>


</div>
</div>

</body>

</html>