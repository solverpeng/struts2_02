<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <center>
        session:${sessionScope.sessionKey}
        <hr>
        request:${requestScope.requestKey}
        <hr>
        <h2>Success Page</h2>
    </center>
</body>
</html>
