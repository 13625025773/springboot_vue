<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <meta charset="UTF-8"/>
</head>
<body>
<table width="300px" border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Sex</td>
        <td>Age</td>
    </tr>
    <#if  students??&&(students?size>0)>
        <#list students as student>
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.sex}</td>
        <td>${student.age}</td>
    </tr>
        </#list>
    </#if>
</table>
</body>
</html>