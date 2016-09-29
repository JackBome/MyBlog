<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/9/29
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/link/update" method="post">
        <input type="hidden" name="id" value="${id}">
        链接名称:<input type="text" value="${linkName}" /><br>
        链接地址:<input type="text" value="${linkUrl}" />
        <input type="submit" class="btn btn-primary" value="提交"/>
    </form>
</body>
</html>
