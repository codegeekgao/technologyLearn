package com.codegeek.servlet3;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * 异步监听器
 *
 * @author codegeekgao
 * @version Id: MyAsyncListener.java, 2019/4/27 12:32 PM codegeekgao Exp $$
 */
public class MyAsyncListener implements AsyncListener {
    @Override
    public void onComplete(AsyncEvent asyncEvent) throws IOException {
        System.out.println("MyAsyncListener isComplete");
    }

    @Override
    public void onTimeout(AsyncEvent asyncEvent) throws IOException {
        System.out.println("MyAsyncListener timeOut");
        ServletResponse response = asyncEvent.getAsyncContext().getResponse();
        response.getWriter().write("timeOut");
    }

    @Override
    public void onError(AsyncEvent asyncEvent) throws IOException {
        System.out.println("MyAsyncListener error");
    }

    @Override
    public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
        System.out.println("MyAsyncListener onStartAsync");
    }
}
