<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	
<html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Application</title>
</head>
<body>
<form action="/save" method="post" name="student">
FirstName: <input type="text" name="firstName"/></br>
LastName : <input type="text" name="lastName"/></br>
Age      : <input type="text" name="Age"/></br>
<input type="submit" value="submit">
</form>

<c:if test="${!empty students} ">
<h3>Student List</h3>
	<table class="tg">
	<tr>
		<th width="50">FirstName</th>
		<th width="50">LastName</th>
		<th width="50">Email</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${students}" var="student">
		<tr>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<td>${student.email}</td>
			<td><a href="<c:url value='/edit/${student.firstName}' />" >Edit</a></td>
			<td><a href="<c:url value='/delete/${student.firstName}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>


</c:if>

</body>
</html>