package com.itheima.web;

import com.itheima.service.UserServiceImpl;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet01")
public class LoginServlet01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        /*在web.xml中配置spring配置文件的路径，和配置监听器，
        * 在servleContext域中通过键获取值*/
        WebApplicationContext context = (WebApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.
                ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        UserServiceImpl service = context.getBean("userServiceImpl", UserServiceImpl.class);
        service.serviceLogin();
        System.out.println(service); //打印的都是同一个对象
        response.sendRedirect("/index.jsp");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
