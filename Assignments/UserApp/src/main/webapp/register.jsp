<html>
<body>
<h2>Register</h2>
<form method="post" action="RegisterServlet">
    Name: <input type="text" name="name"/><br/>
    Email: <input type="text" name="email"/><br/>
    Phone: <input type="text" name="phone"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Register"/>
</form>
<c:if test="${not empty error}">
    <div style="color:red">${error}</div>
</c:if>
<a href="login.jsp">Login</a>
</body>
</html>
