<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h3>Please fill your information!</h3>
	<sf:form commandName="user" action="welcome" method="post">
		Name <sf:input type="text" path="firstName" /><br/>
		Last Name <sf:input type="text" path="lastName" /><br/>
		Address <sf:input type="text" path="address" /><br/>
		<input type="submit" name="submit" value="Insert" />
	</sf:form>

</body>
</html>