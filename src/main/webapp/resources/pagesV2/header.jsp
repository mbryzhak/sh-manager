<%-- page configs --%>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- tags --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>
            <c:if test="${title == null}">
                <c:set var="title" value="Smart House Manager" />
            </c:if>
            <c:out value="${title}" />
        </title>
        <%@include file="/resources/bootstrap/css/all.jsp" %>
    </head>
<body>
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <a class="brand" href="/sh-manager/">sh-manager</a>
                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li>
                            <a href="/sh-manager/rates">
                                <i class="icon-home icon-white"></i>
                                Home
                            </a>
                        </li>
                        <li>
                            <a href="/sh-manager/contacts">Contacts</a>
                        </li>
                        <li>
                            <a href="/sh-manager/about">About</a>
                        </li>
                    </ul>
                    <sec:authorize access="!isAuthenticated()">
                        <a class="btn btn-success pull-right" href="/sh-manager/login?fail=false">Login</a>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <a class="btn btn-warning pull-right" href="<c:url value="/j_spring_security_logout" />">Logout</a>
                    </sec:authorize>
                </div>
            </div>
        </div>
    </div>
    <div style="padding-top: 41px">
        <div class="container">