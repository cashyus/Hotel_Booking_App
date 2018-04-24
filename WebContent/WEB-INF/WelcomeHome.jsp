<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Home</title>

<!-- css reference below -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">


</head>

<body>
<div align="center">
	<div id="wrapper">
		<div id="header">
			<h2>Hotel Booking - Stay with us!</h2>
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

	<!-- add new room button  -->
			<input type="button" value="Add Room"
				onclick="window.location.href='AddCustomerForm'; return false;"
				class="add-button" />

	<!-- manage booking button 	 -->
		<input type="button" value= "Manage Customers"
			onclick="window.location.href='ManageCustomers'; return false;"
			class = "manage-button"/>
	<br></br>
	<p>
	
	
	</p>
	<table>	
		<tr>
			<th>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam nibh. Nunc varius facilisis eros. Sed erat. 
			In in velit quis arcu ornare laoreet. Curabitur adipiscing luctus massa. Integer ut purus ac augue commodo commodo. 
			Nunc nec mi eu justo tempor consectetuer. Etiam vitae nisl. In dignissim lacus ut ante. 
			Cras elit lectus, bibendum a, adipiscing vitae, commodo et, dui. Ut tincidunt tortor. 
			Donec nonummy, enim in lacinia pulvinar, velit tellus scelerisque augue, ac posuere libero urna eget neque. 
			Cras ipsum. Vestibulum pretium, lectus nec venenatis volutpat, purus lectus ultrices risus, a condimentum risus mi et 
			quam. Pellentesque auctor fringilla neque. Duis eu massa ut lorem iaculis vestibulum. Maecenas facilisis elit sed justo.
			 Quisque volutpat malesuada velit. 
					
			
			</th>
		</tr>
	</table>	
		
</div>

</div>
</body>

</html>
