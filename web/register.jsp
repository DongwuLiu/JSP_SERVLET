<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
    <form action="RegServlet" method="get">
        请输入信息：
        <table>
            <tr>
                <td>客户名：</td>
                <td>
                    <input type="text" id="username" name="username"/>
                </td>
            </tr>
            <tr>
                <td>邮箱地址：</td>
                <td>
                    <input type="text" id="email" name="email"/>
                </td>
            </tr>
            <tr>
                <td>电话：</td>
                <td>
                    <input type="text" id="mobile" name="mobile"/>
                </td>
            </tr>
        </table>
        <input type="submit" value="确定"/>
        <input type="reset" value="重置"/>
    </form>
</body>
</html>
