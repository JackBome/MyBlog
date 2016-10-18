<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/17
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <title>manager</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/font-awesome.min.css" />
    <!-- fonts -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/ace-fonts.css" />
    <!-- ace styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/ace.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/ace-rtl.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/styles/ace-skins.min.css" />
    <!-- endbuild -->
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
</head>
<body >
<div class="navbar navbar-default" id="navbar">
    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small><i class="icon-leaf"></i>
                    个人Blog后台</small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

        <div class="" id="js-navbar-collapse" >
            <div class="navbar-header pull-right" role="navigation" ng-show="isLoggedIn">
                <ul class="nav ace-nav">

                    <li class="light-blue">
                        <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                            <img class="nav-user-photo" src="login.png" alt="Admin's Photo" />
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                            <li>
                                <a href="#">
                                    <i class="icon-cog"></i>
                                    设置
                                </a>
                            </li>

                            <li>
                                <a href="#">
                                    <i class="icon-user"></i>
                                    个人信息
                                </a>
                            </li>

                            <li class="divider"></li>

                            <li>
                                <a href="#" >
                                    <i class="icon-off"></i>
                                    退出
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul><!-- /.ace-nav -->
            </div><!-- /.navbar-header -->


        </div>

    </div><!-- /.container -->
</div>

<div class="main-container" id="main-container">
    <script type="text/javascript">try{ace.settings.check('main-container' , 'fixed')}catch(e){}</script>

    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>

        <div class="sidebar" id="sidebar">
            <ul class="nav nav-list">
                <li>
                    <a href="<%=request.getContextPath()%>/main">
                        <i class="icon-dashboard"></i>
                        <span class="menu-text"> 网站前台 </span>
                    </a>
                </li>

                <li>
                    <a href="#" onclick="showAtRight('<%=request.getContextPath()%>/link/list')">
                        <i class="icon-text-width"></i>
                        <span class="menu-text"> 链接管理 </span>
                    </a>
                </li>

                <li>
                    <a href="#" class="dropdown-toggle" onclick="showAtRight('<%=request.getContextPath()%>/BlogCategory/list')">
                        <i class="icon-file-text"></i>
                        <span class="menu-text" > 分类管理 </span>
                        <b class="arrow icon-angle-down"></b>
                    </a>

                </li>


            </ul><!-- /.nav-categoryPVlist -->

            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>
            <script>
                //加载页面的时候根据url选中左边的菜单
                (function() {
                    var uri = "@{requestHeader.uri}";

                    if(uri != "/") {
                        var selectedA = $("li[menu-container='true'] > a").filter(function(index) {
                            return $(this).attr("href") == uri;
                        });
                        selectedA.parent("li").addClass("active");
                        selectedA.parentsUntil("ul[class='nav nav-list']", "li").last().addClass("active open");
                    }
                })();
            </script>

        </div>

        <div class="main-content" >
            <div class="" style="margin: 10px">
                <div id="content">
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
                            <th colspan="2">操作</th>
                        </tr>
                        </thead>
                        <tbody>
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
                                <td><fmt:formatDate value="${blog.date}"  type="date" dateStyle="default"/>
                                </td>
                                <td><a onclick="return confirm('确定要删除吗?')" href="<%=request.getContextPath()%>/Blog/delete/${blog.id}" class="btn btn-danger">删除</a></td>
                                <td><a href="#" onclick="showAtRight('<%=request.getContextPath()%>/Blog/updateUI/${blog.id}')" class="btn btn-info">修改</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </div>
    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="icon-double-angle-up icon-only bigger-110"></i>
    </a>

    <script type="text/javascript">

        /*
         * 对选中的标签激活active状态，对先前处于active状态但之后未被选中的标签取消active
         * （实现左侧菜单中的标签点击后变色的效果）
         */
        $(document).ready(function () {
            $('ul.nav > li').click(function (e) {
                //e.preventDefault();	加上这句则导航的<a>标签会失效
                $('ul.nav > li').removeClass('active');
                $(this).addClass('active');
            });
        });


        /*
         * 利用div实现左边点击右边显示的效果（以id="content"的div进行内容展示）
         * 注意：
         *   ①：js获取网页的地址，是根据当前网页来相对获取的，不会识别根目录；
         *   ②：如果右边加载的内容显示页里面有css，必须放在主页（即例中的index.jsp）才起作用
         *   （如果单纯的两个页面之间include，子页面的css和js在子页面是可以执行的。 主页面也可以调用子页面的js。但这时要考虑页面中js和渲染的先后顺序 ）
         */
        function showAtRight(url) {
            var xmlHttp;

            if (window.XMLHttpRequest) {
                // code for IE7+, Firefox, Chrome, Opera, Safari
                xmlHttp=new XMLHttpRequest();	//创建 XMLHttpRequest对象
            }
            else {
                // code for IE6, IE5
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
            }

            xmlHttp.onreadystatechange=function() {
                //onreadystatechange — 当readystate变化时调用后面的方法

                if (xmlHttp.readyState == 4) {
                    //xmlHttp.readyState == 4	——	finished downloading response

                    if (xmlHttp.status == 200) {
                        //xmlHttp.status == 200		——	服务器反馈正常

                        document.getElementById("content").innerHTML=xmlHttp.responseText;	//重设页面中id="content"的div里的内容
                        executeScript(xmlHttp.responseText);	//执行从服务器返回的页面内容里包含的JavaScript函数
                    }
                    //错误状态处理
                    else if (xmlHttp.status == 404){
                        alert("出错了☹   （错误代码：404 Not Found），……！");
                        /* 对404的处理 */
                        return;
                    }
                    else if (xmlHttp.status == 403) {
                        alert("出错了☹   （错误代码：403 Forbidden），……");
                        /* 对403的处理  */
                        return;
                    }
                    else {
                        alert("出错了☹   （错误代码：" + request.status + "），……");
                        /* 对出现了其他错误代码所示错误的处理   */
                        return;
                    }
                }

            }

            //把请求发送到服务器上的指定文件（url指向的文件）进行处理
            xmlHttp.open("GET", url, true);		//true表示异步处理
            xmlHttp.send();
        }
    </script>
</div>
</body>
</html>

