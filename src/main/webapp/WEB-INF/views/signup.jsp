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
		<form action="signup" method="post">
			<Label>First Name</Label>:<input type="text" name="firstName" id="firstName" /><br>
			<Label>Last Name</Label>:<input type="text" name="lastName" id="lastName" /><br>
			<Label>Username</Label>:<input type="text" name="username" id="username" /><br>
			<Label>Password</Label>:<input type="password" name="password" id="password" /><br>
			<input type="submit" value="Submit"/> 
		</form> 
	</body> 
</html> 
