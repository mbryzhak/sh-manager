<%@include file="header.jsp"%>
<div class="page-header">
    <h1>Introducing Smart House Manager</h1>
</div>
<sec:authorize access="isAuthenticated()">
<div class="page-header">
    <h3>Rates settings</h3>
</div>
<form id="rates" class="form-horizontal">
    <c:forEach var="i" begin="1" end="5">
        <div class="control-group">
            <label class="control-label" for="sensor<c:out value="${i}"></c:out>">Rate for Sensor <c:out value="${i}"></c:out></label>
            <div class="controls">
                <input id="sensor<c:out value="${i}"></c:out>" type="text" placeholder="Sensor <c:out value="${i}"></c:out>">
                <span class="help-inline info">Current state: </span>
            </div>
        </div>
    </c:forEach>
    <div style="padding-left: 48px">
        <a class="btn btn-success" type="submit">Update rates</a>
        <a class="btn btn-inverse" type="submit">Current rates</a>
    </div>
</form>
<legend></legend>
<div class="page-header">
    <h3>Recent Activity</h3>
</div>
</sec:authorize>
<%@include file="footer.jsp"%>