<%@include file="pageIncludes.jsp"%>
<div id="header" class="transparent">
    <div class="header-base-left">
        <a id="header-sh-manager-link" href="/sh-manager">Smart House Manager</a>
    </div>
    <div class="header-base-right">
        <%-- TODO: hardcoded value --%>
        <%--<c:set var="isOwnerLogged" value="${true}"></c:set>--%>
        <c:if test="true">
            <span>
                <a id="register-new-link" href="#">Register</a>
                <a id="login-link" href="/sh-manager/login.htm">Login</a>
            </span>
        </c:if>
        <c:if test="false">
            <span>
                <a id="logout-link" href="#">Logout</a>
            </span>
        </c:if>
    </div>
</div>