<%--
  Created by IntelliJ IDEA.
  User: Olliween
  Date: 2018/3/16
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
    <center>
        <s:form action="add" method="POST">
            <tr>
                <td colspan="2" align="center">
                    <h1><s:text name="欢迎注册"/></h1>
                    <br>
                    <s:property value="exception.message"/>
                </td>
            </tr>
            <s:textfield name="newCustom.name" label="姓名" required="true"></s:textfield>
            <s:textfield name="newCustom.password" label="密码" required="true"></s:textfield>
            <s:textfield name="newCustom.mobile" label="电话" required="true"></s:textfield>
            <s:textfield name="newCustom.email" label="邮箱" required="true"></s:textfield>
            <s:submit value="提交"></s:submit>
        </s:form>
    </center>
</body>
</html>
