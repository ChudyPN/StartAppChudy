<%--
  Created by IntelliJ IDEA.
  User: pniemirski
  Date: 05.03.2020
  Time: 16:21
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
<h1>Elo!</h1>
<p>
    ${message}<br/>
    <a href="${pageContext.request.contextPath}/users">Kliknij aby wyświetlić listę</a>
</p>
</body>
</html>
