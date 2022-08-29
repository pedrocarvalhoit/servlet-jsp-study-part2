<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in Welcome</title>
</head>
<body>

	<%	
	 /** Controling the back command, to certifide no one comeback and see the page content*/
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
	%>

	Welcome ${username }<br>
	Niiice log in<br>
	--------------<br>
	<a href="videos.jsp">Videos here</a>
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
	

</body>
</html>