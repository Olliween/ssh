<%--
  Created by IntelliJ IDEA.
  User: Olliween
  Date: 2018/3/16
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>客户登录</title>
</head>
<body>
    <center>
        <s:form action="login" method="POST">
            <s:textfield name="name" label="姓名"></s:textfield>
            <s:password name="password" label="密码"></s:password>
            <s:submit value="提交"></s:submit>
        </s:form>
    </center>
</body>
</html>
