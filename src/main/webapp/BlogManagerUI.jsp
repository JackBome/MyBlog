<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/14
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客管理</title>
</head>
<body>
    <h3>欢迎进入博客管理界面</h3>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>编号</th>
                <th>标题</th>
                <th>概要</th>
                <th>点击数</th>
                <th>内容</th>
                <th>博客图片</th>
                <th>博客排序</th>
                <th>博客分类</th>
                <th>博客日期</th>
            </tr>
        </thead>
        <tbody>
        <%--${blogList}--%>
            <c:forEach items="${blogList}" var="blog">
            <tr>
                <td>${blog.id}</td>
                <td>${blog.title}</td>
                <td>${blog.summary}</td>
                <td>${blog.clickHit}</td>
                <td>${blog.content}</td>
                <td>${blog.blogImg}</td>
                <td>${blog.blogOrderNo}</td>
                <td>${blog.blogCategory.categoryName}</td>
                <td>${blog.date}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
