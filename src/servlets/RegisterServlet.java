package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author liudw
 * @date 2021/2/24 15:07
 * @effect 用户注册处理类
 */

/*
*
* name属性的作用对应web.xml中<servlet-mapping>标签中的<servlet-name>，可以自由设置值
* urlPatterns属性的作用对应web.xml中<servlet-mapping>标签中的<url-pattern>，其值可以跟name属性不同，但是必须跟jsp页面中配置的action一致
*
* */
@WebServlet(name = "RegisterServlet", urlPatterns = "/RegServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>您的名字是：" + username + "</h3>");
        out.println("<h3>您的Email是：" + email + "</h3>");
        out.println("<h3>您的电话是：" + mobile + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");

        PrintWriter out = resp.getWriter();
        //window.location:alert弹框消失后跳转到的页面
        out.println("<script>alert('注册成功!');window.location='index.jsp';</script>");
    }
}
