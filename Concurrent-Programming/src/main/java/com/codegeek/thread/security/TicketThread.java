package com.codegeek.thread.security;

/**
 * use the case of selling tickets to explain the problem of thread insecurity
 *
 * @author DonnieGao
 * @version Id: TicketThread.java, v 0.1 2018/8/24 下午2:42 DonnieGao Exp $$
 */
public class TicketThread extends Thread {

    /**
     * initialize the number of tickets
     */
    private int tickets = 10;

    /**
     * Thread class override method
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // determine the number of tickets is greater than zero
            if (this.tickets > 0) {
                System.out.println(this.getName() + ": the remaining ticket is " + tickets--);
            }
        }
    }


    public static void main(String[] args) {
        // create 3 threads
        TicketThread ticketThread1 = new TicketThread();
        TicketThread ticketThread2 = new TicketThread();
        TicketThread ticketThread3 = new TicketThread();
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();
    }
}
