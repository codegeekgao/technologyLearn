package com.codegeekgao.iteration;

import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * jdk8从外部迭代到内部迭代
 *
 * @author DonnieGao
 * @version Id: Iteration.java, v 0.1 2018/5/7 下午6:41 DonnieGao Exp $$
 */
public class Iteration {

    public static void main(String[] args) {
        /**
         * 构造一个java.awt.Point组成的集合（point代表坐标对象的集合）
         */
        List<Point> pointList = Arrays.asList(new Point(1, 2), new Point(2, 3));
        // jdk5 for-each
        for (Point point : pointList) {
            point.translate(1, 1);
        }

        // jd5 before
        Iterator<Point> iterator = pointList.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            Point next = iterator.next();
            next.translate(1, 1);
        }

        // jdk8 Lambda方法引用（函数式接口）
        pointList.forEach(System.out::println);
        // 原始Lambda
        pointList.forEach((point -> System.out.println(point)));
        // 匿名内部类
        pointList.forEach(new Consumer<Point>() {
            @Override
            public void accept(Point point) {
                System.out.println(point);
            }
        });
    }
}
