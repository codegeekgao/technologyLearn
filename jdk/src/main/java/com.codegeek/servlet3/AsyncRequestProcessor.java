package com.codegeek.servlet3;

import javax.servlet.AsyncContext;
import java.io.IOException;

/**
 * 异步业务工作线程
 *
 * @author codegeekgao
 * @version Id: AsyncRequestProcessor.java, 2019/4/27 12:42 PM codegeekgao Exp $$
 */
public class AsyncRequestProcessor implements Runnable {

    private AsyncContext asyncContext;
    private int time;

    public AsyncRequestProcessor() {

    }

    public AsyncRequestProcessor(AsyncContext asyncContext, int time) {
        this.asyncContext = asyncContext;
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println("是否异步:"+asyncContext.getRequest().isAsyncSupported());
        longProcessing(time);
        try {
            // TODO 这里伪代码，具体的业务线程方法
            asyncContext.getResponse().getWriter().write("处理时间："+time);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 异步调用
        asyncContext.complete();
    }

    private void longProcessing(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
