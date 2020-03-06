<%--
  Created by IntelliJ IDEA.
  User: pniemirski
  Date: 05.03.2020
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<h1>Add a User</h1>
<c:url var="addAction" value="/user/add"></c:url>

<form:form action="${addAction}" commandName="user">
    <table>
        <c:if test="${!empty user.firstName}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="firstName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="review">
                    <spring:message text="Review"/>
                </form:label>
            </td>
            <td>
                <form:input path="review"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty user.firstName}">
                    <input type="submit" value="<spring:message text="Add User"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>User List</h3>
<c:if test="${!empty listUsers}">
    <table>
        <tr>
            <th width="80">ID</th>
            <th width="120">First Name</th>
            <th width="120">Last Name</th>
            <th width="120">Email</th>
            <th width="80">Action</th>
        </tr>
        <c:forEach items="${listUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>
                <td><a href="<c:url value="/edit/${user.id}"/>" class="button">Edit</a>
                    <a href="<c:url value="/remove/${user.id}"/>" class="btn">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>
