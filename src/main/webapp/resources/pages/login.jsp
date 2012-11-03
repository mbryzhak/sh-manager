<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
	<title>sh-manager</title>

    <link rel="stylesheet" type="text/css" href="resources/css/login.css">
    <link rel="stylesheet" type="text/css" href="resources/css/global.css">

    <script type="text/javascript" src="resources/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="resources/js/validator.js"></script>
    <script type="text/javascript" src="resources/js/login.js"></script>

</head>
<body>
    <div>
        <div>
            <h2 class="header-login" align="center">Sign in to your Dashboard</h2>
        </div>
        <div class="login-container">
            <form id="loginForm">
                <div class="error hidden">
                    <div class="ui-state-error"></div>
                </div>
                <div>
                    <div class="field-row">
                        <input id="loginField" name="login-field" class="text-field" type="text" placeholder="Email Address"><br>
                    </div>
                    <div class="field-row">
                        <input id="passwordField" name="password-field" class="text-field" type="password" placeholder="Password"><br>
                    </div>
                <span class="buttons-wrap">
                    <a id="cancelBtn" href="/sh-manager" class="button-no-style">Cancel</a>
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