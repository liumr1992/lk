<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html >




<head>
    <meta charset="utf-8">
    <title>Login</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <meta charset="UTF-8">
    <title>Login Form</title>



    <link rel="stylesheet" href="css/style.css">
</head>
<body >
<div id="login">
    <form action="/userLogin" method="post">
        <br>
        <br>
        <br>
        <span class="fontawesome-user"></span>

        <input type="text" id="user" name="name" placeholder="用户名">

        <span class="fontawesome-lock"></span>
        <input type="password" name="password" id="pid"  placeholder="密码">

        <input type="submit" value="登陆" style="background-color: blue">

    </form>

</div>
  </body>
</html>