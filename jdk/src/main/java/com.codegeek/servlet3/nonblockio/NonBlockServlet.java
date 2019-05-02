package com.codegeek.servlet3.nonblockio;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author codegeekgao
 * @version Id: NonBlockServlet.java, 2019/5/2 3:58 PM codegeekgao Exp $$
 */
@WebServlet(urlPatterns = "/NonBlockServlet", asyncSupported = true)
public class NonBlockServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取异步对象AsyncContext
        AsyncContext asyncContext = req.startAsync();
        // 获取非阻塞输入流
        ServletInputStream inputStream = req.getInputStream();
        // 异步读取io，也在MyReadListener异步处理业务
        inputStream.setReadListener(new MyReadListener(asyncContext,inputStream));
        //
        resp.getWriter().write("异步处理中，可能业务没有处理完");
    }

}
