package com.codegeek.servlet3;

import javax.servlet.AsyncContext;

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
    }

    private void longProcessing(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
