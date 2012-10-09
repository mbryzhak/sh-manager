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
            <h2 class="header" align="center">Sign in to your Dashboard</h2>
        </div>
        <div class="login-container">
            <form id="loginForm">
                <div>
                    <div class="field-row">
                        <input id="loginField" name="login-field" class="text-field" type="text" placeholder="Email Address"><br>
                    </div>
                    <div class="field-row">
                        <input id="passwordField" name="password-field" class="text-field" type="password" placeholder="Password"><br>
                    </div>
                <span class="buttons-wrap">
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