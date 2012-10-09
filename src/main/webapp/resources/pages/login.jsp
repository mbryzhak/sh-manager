<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Login Page</title>
    <style type="text/css">
        <%@include file="../css/login.css"%>
        <%@include file="../css/global.css"%>
    </style>
</head>
<body>
    <div>
        <div>
            <h2 class="loginHeader" align="center">Sing in to your Dashboard</h2>
        </div>
        <div class="container">
            <form id="loginForm">
                <div>
                    <div class="fieldRow">
                        <input id="loginField" name="loginField" class="textField" type="text" placeholder="Email Address"><br>
                    </div>
                    <div class="fieldRow">
                        <input id="passwordField" name="passwordField" class="textField" type="password" placeholder="Password"><br>
                    </div>
                <span class="buttonsWrap">
                    <a id="cancelBtn" href="#" class="button-no-style">Cancel</a>
                    <a id="loginBtn" href="#" class="button">Login</a>
                </span>
                </div>
            </form>
        </div>
        <div align="center">
            <h5 class="bottom-info">You should login to manage your properties</h5>
        </div>
    </div>
</body>
</html>