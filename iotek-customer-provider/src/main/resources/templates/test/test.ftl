<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="/v1/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/v1/static/js/bootstrap.min.js"></script>
</head>
<body>
<#if info ??>
<h1>${info}</h1>
<#else>
<a href="/v1/hello/login.view">登录</a>
</#if>
<a href="/v1/hello/all.do">查询所有</a>

</body>
</html>