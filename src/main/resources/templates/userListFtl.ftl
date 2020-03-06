<html>
<head>
    <title>freemarker 展示用户</title>
    <meta charset="UTF-8" />
</head>
<body>

<div>freemarker 展示用户</div>
<table border="1" align="center" width="50%">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
    </tr>
   <#-- 迭代一个list list的名称叫list -->
    <#list listUser as user>
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userAge}</td>
        </tr>
    </#list>

</table>


</body>

</html>