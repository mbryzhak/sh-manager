<%@include file="common/pageIncludes.jsp"%>
<html>
    <head>
        <title>Welcome</title>
        <%@include file="common/headIncludes.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <h2 align="center">Congrats! You are logged in with username: <b><c:out value="userName"></c:out></b> and password: <b><c:out value="password"></c:out></b></h2>
    </body>
</html>