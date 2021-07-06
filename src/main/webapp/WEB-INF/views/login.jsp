<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>User Login</h1>
		<form action="confirmation" method="post">
			<Label>User Name</Label>:<input type="text" name="uname" id="uname"><br>
			<Label>Password</Label>:<input type="password" name="pass" id="pass"><br>
			<input type="submit" value="Login">
		</form>
    </body>
</html>
