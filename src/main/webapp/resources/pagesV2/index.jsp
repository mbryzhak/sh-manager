<%@include file="header.jsp"%>
<div class="page-header">
    <h1>Introducing Smart House Manager</h1>
</div>
<sec:authorize access="isAuthenticated()">
<div class="page-header">
    <h3>Congrats! You are signed in</h3>
</div>
</sec:authorize>
<%@include file="footer.jsp"%>