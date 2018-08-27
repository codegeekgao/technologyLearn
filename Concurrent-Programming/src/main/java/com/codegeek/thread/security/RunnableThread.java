package com.codegeek.thread.security;

/**
 * multipart threads example
 *
 * @author DonnieGao
 * @version Id: RunnableThread.java, v 0.1 2018/8/24 下午2:58 DonnieGao Exp $$
 */
public class RunnableThread implements Runnable {

    /**
     * initialize the number of tickets
     */
    private int tickets = 10;

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // determine the number of tickets is greater than zero
            if (this.tickets > 0) {
                System.out.println(Thread.currentThread().getName() + ": the remaining ticket is " + tickets--);
            }
        }
    }

    public static void main(String[] args) {
        // Runnable multipart thread share resource
        RunnableThread runnableThread = new RunnableThread();
        Thread t1 = new Thread(runnableThread);
        Thread t2 = new Thread(runnableThread);
        Thread t3 = new Thread(runnableThread);
        t1.start();
        t2.start();
        t3.start();
    }
}
