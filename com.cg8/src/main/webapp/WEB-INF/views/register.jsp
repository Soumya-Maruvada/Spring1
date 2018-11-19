<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>
<c:url var="myAction" value="checkRegister.obj"></c:url>
<form:form method="post" modelAttribute="user" action="${myAction}">
	Enter Firstname:<form:input path="firstName"/><form:errors path="firstName" cssStyle="color:red"/><br/>
	Enter Lastname:<form:password path="lastName"/><form:errors path="lastName" cssStyle="color:red"/><br/>
	Gender:<form:radiobutton path = "gender" value="M" label="Male"/><br/>
			<form:radiobutton path = "gender" value="F" label="Female"/><br/>
	<form:input path="email"/><br/>
	Select Skills:<form:checkbox items = "${skillList}" path="skillSet"/><br/>
	Select City:<form:select path="city">
			<form:option value="" label="Please Select"/><br/>
			<form:options items = "${cityList}"/>
			</form:select>
			<br/>
	<input type="submit" value="register"/>
</form:form>
</body>
</html>