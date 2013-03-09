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
    <c:forEach var="i" begin="0" end="9">
        <tr>
            <td><c:out value="${i+1}" /></td>
            <td><fmt:formatDate pattern="MMM-dd hh:mm:ss" value="${ratesList[i].dateTime}" /></td>
            <td><c:out value="${ratesList[i].sensor1}" /></td>
            <td><c:out value="${ratesList[i].sensor2}" /></td>
            <td><c:out value="${ratesList[i].sensor3}" /></td>
            <td><c:out value="${ratesList[i].sensor4}" /></td>
            <td><c:out value="${ratesList[i].sensor5}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="page-header">
    <h3>Rates settings</h3>
</div>
<div id="rates" class="form-horizontal">
    <div id="rateProgress" class="progress progress-striped active hidden">
        <div class="bar" style="width: 100%; padding-top: 15px;"></div>
    </div>
    <div id="rateUpdateError" class="alert alert-error hidden">
        <button type="button" class="close">&times;</button>
        <strong>Error!</strong> Rate(s) was not updated. Please try one more time
    </div>
    <div id="rateUpdateSuccess" class="alert alert-success hidden">
        <button type="button" class="close">&times;</button>
        <strong>Success!</strong> Rate(s) was updated successfully
    </div>
    <p class="muted">Enter default value(int|float) for each sensor. Leave field empty to disable a sensor</p>
    <c:forEach var="i" begin="1" end="5">
        <div class="control-group">
            <input id="sensor<c:out value="${i}" />" class="input-medium" type="text" placeholder="Sensor <c:out value="${i}" />">
            <span class="help-inline muted" style="font-size: 14px; margin-left: 20px">Here should be some detailed description of what your <strong>Sensor<c:out value="${i}"></c:out></strong> is used for</span>
        </div>
    </c:forEach>
    <div>
        <a id="updateAllRates" class="btn btn-success" onclick="Rates.updateSensorRates(0)">Update all rates</a>
        <%--<a class="btn btn-inverse" type="submit">Current rates</a>--%>
    </div>
</div>
<%@include file="footer.jsp"%>еtw