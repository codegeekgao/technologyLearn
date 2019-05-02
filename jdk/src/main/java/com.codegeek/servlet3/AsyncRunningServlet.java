package com.codegeek.servlet3;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * servlet3异步使用继IO线程，创建业务Runnable,在IO线程传递AsyncContext对象,
 * 使用线程池(自定义累继承ServletListener新建线程，设置request域对象中)执行这个业务线程
 *
 * @author codegeekgao
 * @version Id: AsyncRunningServlet.java, 2019/4/27 12:00 PM codegeekgao Exp $$
 */
@WebServlet(urlPatterns = "/AsyncRunningServlet", asyncSupported = true)
public class AsyncRunningServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("AsyncRunningServlet Start | Name=" + Thread.currentThread().getName() + "| ID=" + Thread.currentThread().getId());
        String time = req.getParameter("time");
        int processTime = Integer.valueOf(time);
        if (processTime > 5000) {
            processTime = 5000;
        }

        // 创建异步上下文对象AsyncContext
        AsyncContext asyncContext = req.startAsync();
        // 添加自定义的异步监听器
        asyncContext.addListener(new MyAsyncListener());
        // 设置4s超时，指定时间未处理完则报异常
        asyncContext.setTimeout(4000L);
        //开启线程执行异步
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) req.getServletContext().getAttribute("executor");
        threadPoolExecutor.execute(new AsyncRequestProcessor(asyncContext, processTime));
        long endTime = System.currentTimeMillis();
        System.out.println("AsyncRunningServlet Start | Name=" + Thread.currentThread().getName() + "| ID=" + Thread.currentThread().getId() + "| Time=" + (endTime - startTime));
    }
}
