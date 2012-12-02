<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Login Page</title>

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
            <form id="loginForm" action="/login.htm" method="post">
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
                    <a id="cancelBtn" href="/sh-manager" class="button-no-style">Cancel</a>
                    <%--<a id="loginBtn" href="login" class="button">Login</a>--%>
                    <input type="submit">
                </span>
                </div>
            </form>
        </div>
        <div align="center">
            <h5 class="bottom-info">You should login to manage your properties</h5><br>
            <h5><c:out value="${dateNow}"></c:out></h5><br>
            <h5><c:out value="${success}"></c:out></h5>
        </div>
    </div>
</body>
</html>