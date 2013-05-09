<%@include file="header.jsp"%>
<div class="page-header">
    <h3>Recent Activity Graph</h3>
</div>
<div class="tabbable tabs-left">
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#sensor1_tab" data-toggle="tab" onmouseup="basic(1);">Sensor 1</a>
        </li>
        <li>
            <a href="#sensor2_tab" data-toggle="tab" onmouseup="basic(2);">Sensor 2</a>
        </li>
        <li>
            <a href="#sensor3_tab" data-toggle="tab" onmouseup="basic(3);">Sensor 3</a>
        </li>
        <li>
            <a href="#sensor4_tab" data-toggle="tab" onmouseup="basic(4);">Sensor 4</a>
        </li>
        <li>
            <a href="#sensor5_tab" data-toggle="tab" onmouseup="basic(5);">Sensor 5</a>
        </li>
    </ul>
    <div class="tab-content">
        <div class="tab-pane active" id="sensor1_tab">
            <div class="flotr-example" style="display: block">
                <div class="flotr-example-editor">
                    <div class="editor">
                        <div id="recent_activity_graph1" class="render" style="width: 100%; height: 350px;">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="page-header">
    <h3>Recent Activity Table</h3>
</div>
<table class="table table-striped">
    <thead>
        <tr>
            <td>#</td>
            <td>DateTime</td>
            <c:forEach var="i" begin="1" end="5">
                <td>Sensor <c:out value="${i}" /></td>
            </c:forEach>
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
        <strong>Error!</strong> Rate(s) was not updated. Please check rate settings and try one more time
    </div>
    <div id="rateUpdateSuccess" class="alert alert-success hidden">
        <button type="button" class="close">&times;</button>
        <strong>Success!</strong> Rate(s) was updated successfully
    </div>
    <p class="muted">Enter default value(int|float) for each sensor. Leave field empty to disable a sensor</p>
    <c:forEach var="i" begin="1" end="5">
        <div class="control-group">
            <input id="sensor<c:out value="${i}" />" class="input-medium" type="text" placeholder="Sensor <c:out value="${i}" />" onkeypress="Validator.validateNumber(event)">
            <span class="help-inline muted" style="font-size: 14px; margin-left: 20px">Here should be some detailed description of what your <strong>Sensor<c:out value="${i}"></c:out></strong> is used for</span>
        </div>
    </c:forEach>
    <div>
        <a id="updateAllRates" class="btn btn-success">Update all rates</a>
        <%--<a class="btn btn-inverse" type="submit">Current rates</a>--%>
    </div>
</div>
<%@include file="footer.jsp"%>
<script>
    function basic(sensor_number) {

        var s1 = [];
        var s2 = [];
        var s3 = [];
        var s4 = [];
        var s5 = [];
        var to_draw = [];

        <c:forEach var="j" begin="0" end="49">
            s1.push([<c:out value="${j}" />, <c:out value="${ratesListLarge[j].sensor1}" />]);
            s2.push([<c:out value="${j}" />, <c:out value="${ratesListLarge[j].sensor2}" />]);
            s3.push([<c:out value="${j}" />, <c:out value="${ratesListLarge[j].sensor3}" />]);
            s4.push([<c:out value="${j}" />, <c:out value="${ratesListLarge[j].sensor4}" />]);
            s5.push([<c:out value="${j}" />, <c:out value="${ratesListLarge[j].sensor5}" />]);
        </c:forEach>

        switch(sensor_number) {
            case 1: to_draw = s1;
                break;
            case 2: to_draw = s2;
                break;
            case 3: to_draw = s3;
                break;
            case 4: to_draw = s4;
                break;
            case 5: to_draw = s5;
                break;
            default : break;
        }

        Flotr.draw(document.getElementById('recent_activity_graph1'), [to_draw], {
            xaxis: {
                minorTickFreq: 4
            },
            grid: {
                minorVerticalLines: true
            }
        });
    }
    basic(1);
</script>