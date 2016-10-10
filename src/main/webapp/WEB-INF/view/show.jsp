<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/9
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>show</title>
</head>
<body>
    <h2>恭喜<h3>${sessionScope.username}</h3>登录成功</h2>

    <br>

    <hr>


    <a class="btn btn-primary" href="<%=request.getContextPath()%>/blogger/updateUI/${sessionScope.username}">编辑个人信息</a>
</body>
</html>
