package com.codegeek.servlet3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 上下文监听器（监控整个Servlet）
 *
 * @author codegeekgao
 * @version Id: AppContextListener.java, 2019/4/27 1:52 PM codegeekgao Exp $$
 */
public class AppContextListener implements ServletContextListener {

    /**
     * Context初始化要做的事情
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 200, 5000L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
        servletContextEvent.getServletContext().setAttribute("executor", threadPoolExecutor);
    }

    /**
     * Context完成后调用的方法
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ThreadPoolExecutor threadPoolExecutor= (ThreadPoolExecutor) servletContextEvent.getServletContext().getAttribute("executor");
        threadPoolExecutor.shutdown();
    }
}
