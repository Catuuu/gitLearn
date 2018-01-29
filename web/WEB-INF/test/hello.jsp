<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/16 0016
  Time: 下午 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/static/jquery.min.js"></script>
<html>
<head>
    <title>springMvc测试</title>
    <style>
        .content{
            width: 200px;
            height: 400px;
            background-color: beige;
        }
    </style>
    <script>
        $(function () {
            $("#ValidateCode").click(function () {
                var newSrc = "/hello/image?t=" + (new Date()).getTime();
                this.src=newSrc;
                return false;
            });
        })
    </script>
</head>
<body>
<div class="content">国际惯例:helloWorld</div>
<a href="/hello/hello2">点击</a>
<img id="ValidateCode" style="width:100px;height:30px;cursor:pointer" src="/hello/image" title="看不清，点击换一张" />
</body>
</html>
