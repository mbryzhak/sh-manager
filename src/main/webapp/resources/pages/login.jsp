<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Login Page</title>
    <style type="text/css">
        <%@include file="../css/login.css"%>
    </style>
</head>
<body>
    <div class="container">
        <form id="loginForm">
            <div>
                <input id="loginField" class="textField" type="text"><br>
                <input id="passwordField" class="textField" type="text"><br>
                <span>
                    <input id="loginBtn" type="button" class="button" value="Login">
                    <input id="cancelBtn" type="button" class="button no-style" value="Cancel">
                </span>
            </div>
        </form>
    </div>
</body>
</html>