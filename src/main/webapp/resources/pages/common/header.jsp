<div class="inner">
    <div id="header" class="transparent">
        <div class="header-base-left">
            <a id="header-sh-manager-link" href="/sh-manager">Smart House Manager</a>
        </div>
        <div class="header-base-right">
            <sec:authorize access="isAuthenticated()">
                <span class="font-base">
                    Hello, <b><c:out value="${login}"></c:out>!</b>
                    <a class="button-no-style" href="<c:url value="/j_spring_security_logout" />"> Logout</a>
                </span>
            </sec:authorize>
        </div>
    </div>
</div>