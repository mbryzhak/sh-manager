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
            <form id="loginForm" action="<c:url value='j_spring_security_check' />" method="POST" onsubmit="return LoginController.validate()">
                <div class="error hidden">
                    <div class="ui-state-error"></div>
                </div>
                <div>
                    <div class="field-row">
                        <input id="loginField" name="j_username" class="text-field" type="text" placeholder="Email Address"><br>
                    </div>
                    <div class="field-row">
                        <input id="passwordField" name="j_password" class="text-field" type="password" placeholder="Password"><br>
                    </div>
                <span class="buttons-wrap">
                    <a id="cancelBtn" class="button-no-style" href="/sh-manager/">Cancel</a>
                    <input id="loginBtn" class="button" type="submit" value="Login" />
                </span>
                </div>
            </form>
        </div>
        <div align="center">
            <h5 class="bottom-info">You should login to manage your properties</h5><br>
        </div>
    </div>
    <c:if test="${message != null}">
        <script>Validator.appendError("${message}");</script>
    </c:if>
    <%--<c:if test="${not empty error}">
        <div class="errorblock">
            Your login attempt was not successful, try again.<br /> Caused :
                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>
    </c:if>--%>
</body>
</html>