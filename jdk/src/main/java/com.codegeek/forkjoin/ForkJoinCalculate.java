package com.codegeek.forkjoin;

import lombok.AllArgsConstructor;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * forkjoin框架
 *
 * @author gaoxinpeng
 * @version Id: ForkJoinCalculate.java, v 0.1 2018/5/2 下午10:21 gaoxinpeng Exp $$
 */
@AllArgsConstructor
public class ForkJoinCalculate extends RecursiveTask<Long> {
    // RecursiveAction 无返回值
    // RecursiveTask 有返回值

    /**
     * 起始值
     */
    private Long start;

    /**
     * 结束值
     */
    private Long end;

    private static final Long THRESHOLD = 10000L;

    /**
     * The main computation performed by this task(1+....10000).
     *
     * @return the result of the computation
     */

    @Override
    protected Long compute() {
        long length = end - start;

        if (length <= THRESHOLD) {
            long sum = 0;

            for (long i = start; i <= end; i++) {
                sum += i;
            }

            return sum;
        } else {
            long middle = (start + end) / 2;

            ForkJoinCalculate left = new ForkJoinCalculate(start, middle);
            left.fork(); //拆分，并将该子任务压入线程队列

            ForkJoinCalculate right = new ForkJoinCalculate(middle + 1, end);
            right.fork();

            return left.join() + right.join();
        }

    }

    /**
     * 测试fork/join
     *
     * @param args
     */
    public static void main(String[] args) {
        // FornJoinTest();
        System.out.println();
        Instant start = Instant.now();
        //多线程
        long reduce = LongStream.rangeClosed(0L, 10000000L).parallel().reduce(0L, Long::sum);
        System.out.println(reduce);
        long sum = LongStream.rangeClosed(0L, 10000000L).parallel().sum();
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println("计算消耗了" + Duration.between(start, end).toMillis() + "豪秒");
    }

    /**
     * FornJoinTest
     */
    private static void FornJoinTest() {
        Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinCalculate task = new ForkJoinCalculate(0L, 10000000L);
        Long invoke = pool.invoke(task);
        System.out.println(invoke);
        Instant end = Instant.now();
        // Duration.between(start,end).getSeconds()
        System.out.println("计算消耗了" + Duration.between(start, end).toMillis() + "豪秒");
    }
}
