<%@include file="common/pageIncludes.jsp"%>
<html>
<head>
	<title>Login Page</title>

    <%@include file="common/headIncludes.jsp"%>
    <link rel="stylesheet" type="text/css" href="resources/css/login.css">
    <script type="text/javascript" src="resources/js/login.js"></script>

</head>
<body>
    <%@include file="common/header.jsp"%>
    <div>
        <div>
            <h2 class="header-login" align="center">Sign in to your Dashboard</h2>
        </div>
        <div class="login-container">
            <div id="loginForm">
                <div class="error hidden">
                    <div class="ui-state-error"></div>
                </div>
                <div>
                    <div class="field-row">
                        <input id="loginField" name="login" class="text-field" type="text" placeholder="Email Address"><br>
                    </div>
                    <div class="field-row">
                        <input id="passwordField" name="password" class="text-field" type="password" placeholder="Password"><br>
                    </div>
                <span class="buttons-wrap">
                    <a id="cancelBtn" href="#" class="button-no-style">Cancel</a>
                    <a id="loginBtn" href="#" class="button">Login</a>
                </span>
                </div>
            </div>
        </div>
        <div align="center">
            <h5 class="bottom-info">You should login to manage your properties</h5><br>
            <h5><c:out value="${dateNow}"></c:out></h5><br>
            <h5><c:out value="${success}"></c:out></h5>
        </div>
    </div>
</body>
</html>