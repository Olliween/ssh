<%--
  Created by IntelliJ IDEA.
  User: Olliween
  Date: 2018/3/16
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>显示客户信息</title>
</head>
<body>
<center>
    <h1>客户信息</h1>
    <table border="1" width="600">
        <tr>
            <th>客户ID</th>
            <th>客户名</th>
            <th>客户电话</th>
            <th>客户邮箱</th>
            <th>是否删除</th>
            <th>是否修改</th>
        </tr>
        <s:iterator value="#request.customlist" id="st">
            <tr>
                <td align="center"><s:property value="#st.id"/></td>
                <td align="center"><s:property value="#st.name"/></td>
                <td align="center"><s:property value="#st.mobile"/></td>
                <td align="center"><s:property value="#st.email"/></td>
                <td><a href="delete.action?id=<s:property value='#st.id '/>">删除</a></td>
                <td><a href="pages/update.jsp?id=<s:property value='#st.id '/>">修改</a></td>
            </tr>
        </s:iterator>
    </table>
    <br>
    <s:a href="pages/add.jsp">添加客户</s:a>
</center>
</body>
</html>
