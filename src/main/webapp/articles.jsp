<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/18
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>articles</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/css.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="col-md-2">
        <img src="${pageContext.request.contextPath}/images/login.png" id="headImg"/>
        <h4>${blogger.userName}</h4>
        <h4> ${blogger.nickName}</h4>
        <div> ${blogger.proFile}</div>
    </div>
    <div class="col-md-10">
        <h2> ${blog.title}</h2>
        <date><fmt:formatDate value="${blog.date}"  type="date" dateStyle="default"/></date>
        <span>阅读量${blog.clickHit}</span>
        <div>
            ${blog.summary}
        </div>
        <hr class="hr"/>
        <div class="content">
            ${blog.content}
        </div>
    </div>
</div>
</body>
</html>
