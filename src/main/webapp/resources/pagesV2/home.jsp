<%@include file="header.jsp"%>
<div class="page-header">
    <h3>Recent Activity</h3>
</div>
<table class="table table-striped">
    <thead>
    <tr>
        <td>#</td>
        <td>DateTime</td>
        <td>Sensor 1</td>
        <td>Sensor 2</td>
        <td>Sensor 3</td>
        <td>Sensor 4</td>
        <td>Sensor 5</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" begin="1" end="10">
        <tr>
            <td><c:out value="${i}"></c:out></td>
            <td><fmt:formatDate pattern="MMM-dd hh:mm:ss" value="${ratesList[i-1].dateTime}"></fmt:formatDate></td>
            <td><c:out value="${ratesList[i-1].sensor1}"></c:out></td>
            <td><c:out value="${ratesList[i-1].sensor2}"></c:out></td>
            <td><c:out value="${ratesList[i-1].sensor3}"></c:out></td>
            <td><c:out value="${ratesList[i-1].sensor4}"></c:out></td>
            <td><c:out value="${ratesList[i-1].sensor5}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<legend></legend>
<div class="page-header">
    <h3>Rates settings</h3>
</div>
<form id="rates" class="form-horizontal">
    <c:forEach var="i" begin="1" end="5">
        <div class="control-group">
                <%--<label class="control-label" for="sensor<c:out value="${i}"></c:out>">Rate for Sensor <c:out value="${i}"></c:out></label>--%>
            <div class="input-append">
                <input id="sensor<c:out value="${i}"></c:out>" class="input-medium" type="text" placeholder="Sensor <c:out value="${i}"></c:out>">
                <button class="btn">Update</button>
                <span class="help-inline muted" style="font-size: 14px; margin-left: 20px">Here should be some detailed description of what your <strong>Sensor<c:out value="${i}"></c:out></strong> is used for</span>
            </div>
        </div>
    </c:forEach>
    <div>
        <a class="btn btn-success" type="submit">Update all rates</a>
        <%--<a class="btn btn-inverse" type="submit">Current rates</a>--%>
    </div>
</form>
<%@include file="footer.jsp"%>