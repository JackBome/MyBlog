<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/10
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/css.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>

</head>
<body>
    <h2>修改${sessionScope.username}信息</h2>
    <form action="<%=request.getContextPath()%>/blogger/update" method="post">

        <input type="hidden" name ="userName" value="${sessionScope.username}"/>
        密码:<input type="text" name="passWord"/>
        别名:<input type="text" name="nickName"/>
        签名:<input type="text" name="proFile"/>
        <input type="submit" class="btn btn-primary" value="提交"/>
    </form>
</body>
</html>
