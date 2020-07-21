<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Register</h1>
   <s:form action="register" modelAttribute="reg">
   Enter name:<s:input path="uname"/><s:errors path="uname"/>
   Enter email:<s:input path="email"/><s:errors path="email"/>
   Enter pass:<s:input path="password"/>
   Enter rpwd:<s:input path="password"/>
   
   </s:form>
   <s:input path="submit"/>
</body>
</html>