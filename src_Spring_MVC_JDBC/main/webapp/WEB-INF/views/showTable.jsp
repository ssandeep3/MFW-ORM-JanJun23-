<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>       
${students}
	<table style="border:1px solid red">
		<tr>
			<th style="border:1px solid red">UserName</th>
			<th style="border:1px solid red">Password</th>
		</tr>
			<c:forEach items="${students}" var="s">
				<tr>
				<td style="border:1px solid red">${s.username}</td>
				<td style="border:1px solid red">${s.password}</td>
				</tr>
				</c:forEach>
			
	</table>
</body>
</html>