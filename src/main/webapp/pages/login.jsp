<%--
  Created by IntelliJ IDEA.
  User: lilja
  Date: 2018/2/3
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>请登陆</h1>

<form action="/loginUser" method="post">
    <input type="text" name="username">
    <br>
    <input type="password" name="password">
    <br>
    <input type="submit" value="提交">
</form>

</body>
</html>
