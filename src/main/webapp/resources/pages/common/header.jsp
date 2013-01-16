<div class="inner">
    <div id="header" class="transparent">
        <div class="header-base-left">
            <a id="header-sh-manager-link" href="/sh-manager">Smart House Manager</a>
        </div>
        <div class="button-no-style header-base-right">
            <sec:authorize access="isAuthenticated()">
                <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
            </sec:authorize>
        </div>
    </div>
</div>