<html>
<body>
<h2>Login</h2>
<form method="post" action="LoginServlet">
    Email: <input type="text" name="email"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
</form>
<c:if test="${not empty error}">
    <div style="color:red">${error}</div>
</c:if>
<a href="register.jsp">Register</a>
</body>
</html>
