<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/9/29
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
    <%--<title>update</title>--%>
    <%--<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="${pageContext.request.contextPath}/static/css/css.css" rel="stylesheet" type="text/css"/>--%>
    <%--<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>--%>

<%--</head>--%>
<%--<body>--%>
<form action="<%=request.getContextPath()%>/BlogCategory/update" method="post">
        <input type="hidden" name="id" value="${id}">
        博客分类名称:<input type="text" name="categoryName" /><br>
        <input type="submit" class="btn btn-primary" value="提交"/>
    </form>
<%--</body>--%>
<%--</html>--%>
