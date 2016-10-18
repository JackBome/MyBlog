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
<form action="<%=request.getContextPath()%>/blog/update" method="post">
        <input type="hidden" name="id" value="${id}">
        博客名称:<input type="text" name="title" /><br>
        博客简介:<input type="text" name="summary" /><br>
        博客点击数:<input type="text" name="clickHit" /><br>
        博客内容:<input type="text" name="content" /><br>
        博客图片:<input type="text" name="blogImg" /><br>
        博客排序:<input type="text" name="blogOrderNo" /><br>
        博客分类:<input type="text" name="blogCategory" /><br>
        博客日期:<input type="text" name="date" /><br>

        <input type="submit" class="btn btn-primary" value="提交"/>
    </form>
<%--</body>--%>
<%--</html>--%>
