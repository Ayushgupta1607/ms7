<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Register</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>

<body>
	<form:form action="adduser" method="post" modelAttribute="userDto">
	Enter username:<form:input path="username" />
		<br />
	Enter password :<form:input path="password" />
		<br />
	Enter profile:<form:select path="profile" >
		<form:option value="ROLE_CLERK" label="clerk" />
		<form:option value="ROLE_MGR" label="manager" />
	<form:option value="ROLE_LAYMAN" label="layman" />
	
		</form:select>
		<br />
	Enter email:<form:input path="email" />
		<br />
		<input type="submit" />
	</form:form>
	<br>
	<a href="home">home</a>
	<br>
</body>
</html>