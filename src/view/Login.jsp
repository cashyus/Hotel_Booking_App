<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<title>Admin Login Page</title>

<style> 
	.errorblock{
	color: #ff0000;
	background-color: #ffEEEE;
	}
</style>
</head>

<body onload ='document.loginForm.j_username.focus();'>
	<h3>Admin Login Page</h3>
	
	<%
		String errorString = (String) request.getAttribute("error");
		if(errorString !=null && errorString.trim().equals("true")){
			out.println("<span class=\"errorblock\"Incorrect login name or password. Please try again");
		}
	
	%>
	
	<form name='loginForm' action="c:url value='login'/>"
method='POST'>

		<table>
				<tr>
					<td>User:</td>
						<td><input type='text' name='username' value =''></td>
				</tr>
 				<tr>
					<td>Password:</td>
						<td><input type='password' name='password'/></td>
				</tr>
				<tr>
						<td><input name= "submit" type="submit" value ="submit" /></td>
						<td><input name="reset" type="reset" /></td>
				</tr>
	
		</table>
		
</form>
</body>

</html>