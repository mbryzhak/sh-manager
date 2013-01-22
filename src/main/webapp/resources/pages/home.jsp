<%@include file="common/pageIncludes.jsp"%>
<html>
    <head>
        <title>Welcome</title>
        <%@include file="common/headIncludes.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div>
            <p class="font-base" style="text-align: center">On this page you can find information about all expected and actual values from each sensor</p>
            <table>
                <thead>
                    <tr>
                        <th>Sensor</th>
                        <th>Value</th>
                        <th>Target</th>
                        <th>Push It</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Sensor #1:</td>
                        <td><i><c:out value="${sensor1}"></c:out></i></td>
                        <td><input id="sensor1-value" type="text"></td>
                        <td><input type="button" value="Set item"></td>
                    </tr>
                    <tr>
                        <td>Sensor #2:</td>
                        <td><i><c:out value="${sensor2}"></c:out></i></td>
                        <td><input id="sensor2-value" type="text"></td>
                        <td><input type="button" value="Set item"></td>
                    </tr>
                    <tr>
                        <td>Sensor #3:</td>
                        <td><i><c:out value="${sensor3}"></c:out></i></td>
                        <td><input id="sensor3-value" type="text"></td>
                        <td><input type="button" value="Set item"></td>
                    </tr>
                </tbody>
     </table>
        </div>
    </body>
</html>