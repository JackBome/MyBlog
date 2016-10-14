<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/12
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/css.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <%--<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap-collapse.js"></script>
</head>
<body>
<div class="container">
    <div class="col-md-8 headName" >
        <div class="page-header">
            <h2>
                        <span class="title">${blogger.nickName }</span>
                <small>
                    ${blogger.proFile}
                </small>
            </h2>
        </div>
        <c:forEach var="blog" items="${blogList}">
        <div class="col-md-2">
            <div>
                <table class="table">
                    <tr>
                        <td class="day"><fmt:formatDate value="${blog.date }" type="date" pattern="dd"/>  </td>
                    </tr>
                    <tr>
                        <td class="month"><fmt:formatDate value="${blog.date }" type="date" pattern="MM"/> 月</td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="col-md-10">
            <h3>${blog.title}</h3>
            <div class="mid">
                分类:
                <a>${blog.blogCategory.categoryName}</a>
                &nbsp|&nbsp作者：
                <a>admin</a>
                &nbsp|&nbsp浏览数：${blog.clickHit}
            </div>
            <hr>
            <div class="summary">${blog.summary}</div>
        </div>
        </c:forEach>
    </div>
    <div class="col-md-4">
        <form class="bs-example bs-example-form" role="form"></form>
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Twitterhandle"></div>
        <br>
        <div>
            <h4>分类</h4>
        </div>
        <div class="category">
            <ul >
                <div class="accordion" id="accordion2">
                    <c:forEach var="bc" items="${blogCategory}">
                    <li class="list-group-item">
                        <span class="badge">${bc.categoryNum}</span>
                        <div class="accordion-group">
                            <div class="accordion-heading">
                                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">${bc.categoryName}</a>
                            </div>
                            <div id="collapseOne" class="accordion-body collapse" style="height: 0px; ">
                                <div class="accordion-inner">
                                    <table class="table table-hover">
                                        <c:forEach items="${blogList}" var="blog">
                                        <tr >
                                            <td>${blog.title}</td>
                                        </tr>
                                        </c:forEach>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </li>
                    </c:forEach>
                </div>
            </ul>
        </div>
    </div>
</div>


</body>
</html>