<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">Welcome to Java World</h1>
	<form action="addstudent" method="post">
		<div style="margin-top: 100px; margin-left: 450px">
			<table>
				<tr>
					<td>Roll No::</td>
					<td><input type="text" name="rno"></td>
				</tr>
				<tr>
					<td>Full Name::</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr >
					<td colspan="2" style="text-align: right; width " width="100"><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>