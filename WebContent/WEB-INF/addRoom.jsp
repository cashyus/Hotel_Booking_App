<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>
<head>
<title>Adding Room</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">


</head>
<body>
	<div align="center">
		<div id="wrapper">
			<div id="header">
				<h2>Hotel Booking - Application</h2>
			</div>

		</div>

		<div id="containter">
			<form:form action="addRoom" modelAttribute="room"
				method="POST">

				<!-- hidden customer id -->

				

				<!-- Home Button -->

				<input type="button" value="Home"
					onclick="window.location.href='WelcomeHome'; return false;"
					class="home-button" />

				<!-- CurrentCustomer Button -->

				<input type="button" value="Current Customers"
					onclick="window.location.href='CurrentCustomers'; return false;"
					class="current-button" />

				<!-- ManageCustomer Button -->

				<input type="button" value="Manage Customers"
					onclick="window.location.href='ManageCustomers'; return false;"
					class="manage-button" />

				<br>

				</br>
				<table>
					<tbody>
					<td><label>Customer Information: </label>

						<tr>
							<td><label>First Name:</label>
							<td><form:input path="firstname" /></td>
						</tr>

						<tr>
							<td><label>Last Name:</label>
							<td><form:input path="lastname" /></td>
						</tr>
						
						</tbody>
				</table>
				<br>
				<table>
					<tbody>	
					<td><label>Room Information:</label>
							<tr>
							<td><label>Room Type:</label>
							<td><form:input path="roomtype" /></td>
						</tr>
						<tr>
							<td><label>Room Service:</label>
							<td><form:input path="roomservice" /></td>
						</tr>
				
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
					</tbody>
				</table>
				<br>

				<p></p>

			</form:form>

		</div>
	</div>
</body>

</html>
