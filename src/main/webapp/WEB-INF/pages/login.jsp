<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h3>Please fill your information!</h3>
	<sf:form commandName="employee" action="vacation" method="post">
		UserName <sf:input type="text" path="employeeUserName" /><br/>
		Password <sf:password  path="employeePassward" /><br/>
		<input type="submit" name="submit" value="Login" />
	</sf:form>

</body>
</html>