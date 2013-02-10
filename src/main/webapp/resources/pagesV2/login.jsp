<%@include file="header.jsp"%>
<div class="page-header">
    <h1>Sign in to your Dashboard</h1>
</div>
<div id="loginError" class="alert alert-error hidden" style="text-align: center">

</div>
<form class="form-horizontal" action="<c:url value='j_spring_security_check' />" method="POST" onsubmit="return LoginController.validate()" style="margin-left: 25%; margin-right: 25%">
    <div class="control-group">
        <label class="control-label" for="inputEmail">Email</label>
        <div class="controls">
            <input type="text" id="inputEmail" name="j_username" placeholder="Email">
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="inputPassword">Password</label>
        <div class="controls">
            <input type="password" id="inputPassword" name="j_password" placeholder="Password">
        </div>
    </div>
    <div class="control-group">
        <div class="controls" style="margin-left: 256px">
            <a class="btn btn-link" href="/sh-manager/" style="text-decoration: none">Cancel</a>
            <button id="login-btn" type="submit" class="btn">Sign in</button>
        </div>
    </div>
</form>
<legend></legend>
<%@include file="footer.jsp"%>
<c:if test="${message != null}">
    <script>Validator.appendError("${message}");</script>
</c:if>