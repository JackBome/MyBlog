<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/9
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/css.css" rel="stylesheet" type="text/css"/>
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
    <form action="<%=request.getContextPath()%>/blogger/denglu" method="post">
        用户名:<input type="text" name="username" />
        密码:<input type="password" name="password"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
