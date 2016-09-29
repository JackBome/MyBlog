<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/9/29
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/link/add>" method="post">
        链接名称:<input type="text" name="linkName"/>
        链接地址:<input type="text" name="linkUrl"/>
        <input type="submit" class="btn btn-primary" value="提交">
    </form>
</body>
</html>
