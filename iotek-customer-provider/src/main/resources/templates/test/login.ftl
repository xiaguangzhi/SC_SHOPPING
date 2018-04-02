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
<form action="/v1/hello/login.do" method="post">
  用户名  <input name="customerName" type="text"><br/>
   密码：  <input name="customerPassword" type="password">
    <input value="登录"  type="submit">
</form>

</body>
</html>