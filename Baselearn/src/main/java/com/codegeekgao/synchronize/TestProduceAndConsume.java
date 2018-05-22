package com.codegeekgao.synchronize;

/**
 * test consumer and producer
 *
 * @author DonnieGao
 * @version Id: TestProduceAndConsume.java, v 0.1 2018/5/22 下午4:29 DonnieGao Exp $$
 */
public class TestProduceAndConsume {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        new Thread(producer, "生产者").start();
        new Thread(consumer, "消费者").start();
    }
}
