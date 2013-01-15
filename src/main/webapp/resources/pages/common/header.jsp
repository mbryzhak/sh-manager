<div class="inner">
    <div id="header" class="transparent">
        <div class="header-base-left">
            <a id="header-sh-manager-link" href="/sh-manager">Smart House Manager</a>
        </div>
        <div class="button-no-style header-base-right">
            <sec:authorize access="isAuthenticated">
                <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
            </sec:authorize>
        </div>
        <%--<div class="header-base-right">
            &lt;%&ndash; TODO: hardcoded value &ndash;%&gt;
            &lt;%&ndash;<c:set var="isOwnerLogged" value="${true}"></c:set>&ndash;%&gt;
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
        </div>--%>
    </div>
</div>