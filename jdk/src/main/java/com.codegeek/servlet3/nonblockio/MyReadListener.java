package com.codegeek.servlet3.nonblockio;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import java.io.IOException;

/**
 * @author codegeekgao
 * @version Id: MyReadListener.java, 2019/5/2 4:01 PM codegeekgao Exp $$
 */
@NoArgsConstructor
@AllArgsConstructor
public class MyReadListener implements ReadListener {

    private AsyncContext asyncContext;

    private ServletInputStream servletInputStream;


    /**
     * 数据可用时，触发该方法
     * @throws IOException
     */
    @Override
    public void onDataAvailable() throws IOException {
        System.out.println("数据可以开始读啦！");
    }

    /**
     * 数据读完后，触发该方法
     * @throws IOException
     */
    @Override
    public void onAllDataRead() throws IOException {
        try {
            // 模拟业务使用1s,在这里也可以开启线程池进行业务处理
            Thread.sleep(1000L);
            asyncContext.getResponse().getWriter().write("业务处理完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 当出现异常后
     * @param throwable
     */
    @Override
    public void onError(Throwable throwable) {
        System.out.println("出错啦！");
    }
}
