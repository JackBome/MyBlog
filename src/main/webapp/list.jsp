<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>链接列表</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <style>
        .w{
            width: 600px;
            margin-left: auto;
            margin-right: auto;
        }

    </style>
</head>
<body>

<table class="table table-hover w">
    <thead>
    <tr>
        <td>#</td>
        <td>名称</td>
        <td>地址</td>
        <td>排序</td>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${linkList}" var="ll" varStatus="l">
            <tr>
                <td>${l.index+1}</td>
                <td>${ll.linkName}</td>
                <td>${ll.linkUrl}</td>
                <td>${ll.orderNo}</td>
                <td><a onclick="return confirm('确定要删除吗?')" href="<%=request.getContextPath()%>/link/delete/${ll.id}" class="btn btn-danger">删除</a></td>
                <td><a href="<%=request.getContextPath()%>/link/updateUI/${ll.id}" class="btn btn-info">修改</a></td>
            </tr>
        </c:forEach>
    </tbody>
    <a class="btn btn-primary" href="<%=request.getContextPath()%>/link/addUI">添加</a>
</table>


</body>
</html>
