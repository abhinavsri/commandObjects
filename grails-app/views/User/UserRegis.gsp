<%--
  Created by IntelliJ IDEA.
  User: abhinav
  Date: 25/7/16
  Time: 10:49 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form action="valid" controller="user">
    UserName<input type="text" name="userName">
    FullName<input type="text" name="fullName">
    lastName<input type="text" name="lastName">
    PassWord<input type="password" name="password">
    Confirm Password<input type="password" name="confirmPassword">
    <button type="submit"value="submit">
    </g:form>
</body>
</html>