<%--
  Created by IntelliJ IDEA.
  User: abc
  Date: 25/11/24
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Bạn đã đăng nhập vào nhân viên với role là: ${sessionScope.role}
<button> <a href="/demo-filter/logout">Đăng xuất</a></button>
</body>
</html>
