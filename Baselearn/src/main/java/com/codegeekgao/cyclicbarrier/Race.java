package com.codegeekgao.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * race
 *
 * @author gaoxinpeng
 * @version Id: Race.java, v 0.1 2018/5/17 下午9:59 gaoxinpeng Exp $$
 */
public class Race {


    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(8);
        List<Athlete> athleteList = new ArrayList<>();
        athleteList.add(new Athlete(cyclicBarrier, "博尔特"));
        athleteList.add(new Athlete(cyclicBarrier, "鲍威尔"));
        athleteList.add(new Athlete(cyclicBarrier, "盖伊"));
        athleteList.add(new Athlete(cyclicBarrier, "布雷克"));
        athleteList.add(new Athlete(cyclicBarrier, "加特林"));
        athleteList.add(new Athlete(cyclicBarrier, "苏炳添"));
        athleteList.add(new Athlete(cyclicBarrier, "路人甲"));
        athleteList.add(new Athlete(cyclicBarrier, "路人乙"));
        Executor executor = Executors.newFixedThreadPool(8);
        for (Athlete athlete : athleteList) {
            executor.execute(athlete);
        }
        // 一组线程等待一个结果
    }
}
