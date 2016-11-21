<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Apply Vacation</title>
</head>
<body>

	<h2>Apply Vacation</h2>
	<sf:form commandName="employeeVacation" action="vacationApply" method="post">
		StartDate (MM/DD/YYYY) <sf:input type="date" path="startDate"/> <br/>
		Last Name (MM/DD/YYYY) <sf:input type="date" path="endDate" /><br/>
		Reason (Sick/Personal) <sf:input type="text" path="vacationType" /><br/>
		<input type="submit" name="submit" value="Insert" />
	</sf:form>
</body>
</html>