<html>

<head>

    <meta charset="UTF-8"/>
</head>

<body>
<form action="/updateUser" method="post">
    <input type="hidden" name="id" id="uid" value="${user.id}">
    姓名: <input type="text" name="name" id="nid" placeholder="${user.name}" value=""><br><br>

    <input type="radio" name="sex" value="1">男
    <input type="radio" name="sex" value="0">女
    <br><br>
    <input type="submit" value="提交">


</form>

</body>


</html>