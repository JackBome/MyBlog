<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>UEditor</title>
    <script type="text/javascript">
        var basePath = "<%=basePath%>";
    </script>
    <script type="text/javascript" src="/ueditor/jsp/ueditor.config.js"></script>
    <script type="text/javascript" src="/ueditor/jsp/ueditor.parse.min.js"></script>
    <script type="text/javascript" src="/ueditor/jsp/ueditor.all.min.js"></script>
    <script type="text/javascript" src="ueditor/jsp/lang/zh-cn/zh-cn.js"></script>

</head>
<body>
<div>
    <div>
        <textarea id="myEditor"></textarea>
    </div>
    <script>
        UE.getEditor('myEditor');
    </script>

</div>
</body>
</html>