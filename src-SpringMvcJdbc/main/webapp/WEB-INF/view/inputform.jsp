<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form:form method="POST" action="/processForm"
		modelAttribute="Student">
		<form:label path="name">Name</form:label>
		<form:input path="name" />

		<form:label path="branch">Branch</form:label>
		<form:input path="branch" />

		<input type="submit" value="Submit" />
	</form:form>
</body>

</html>