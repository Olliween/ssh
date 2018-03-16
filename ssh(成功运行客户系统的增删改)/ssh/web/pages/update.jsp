<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Olliween
  Date: 2018/3/16
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改客户信息</title>
</head>
<body>
    <center>
        <s:form action="update" method="POST">
            <tr>
                <td colspan="2">
                    <h1><s:text name="修改客户信息"/></h1>
                    <br><s:actionerror/>
                </td>
            </tr>
            <td>客户ID:<s:property value="#parameters.id"/> </td>
            <s:textfield name="custom.id" key="客户ID" required="true"></s:textfield>
            <s:textfield name="custom.name" key="客户名" required="true"></s:textfield>
            <s:textfield name="custom.password" key="客户密码" required="true"></s:textfield>
            <s:textfield name="custom.mobile" key="电话" required="true"></s:textfield>
            <s:textfield name="custom.email" key="邮箱" required="true"></s:textfield>
            <s:submit value="提交"/>
            <s:reset value="重置"/>
        </s:form>
    </center>
</body>
</html>
