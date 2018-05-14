package com.codegeekgao.stream;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Stream的api学习
 *
 * @author DonnieGao
 * @version Id: StreamApi.java, v 0.1 2018/5/7 下午8:07 DonnieGao Exp $$
 */
public class StreamApi {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
       /* List<Point> pointList = new ArrayList<>();
        for (Integer i : list) {
            pointList.add(new Point(i %3,i/1));
        }*/

        //  将list集合中的每一个元素映射到每个point对象，再将point对象映射到距离原点的距离，然后找出最大值.
        OptionalDouble max = list.parallelStream().map((i) -> new Point(i % 3, i / 1)).mapToDouble((p) -> p.distance(0, 0)).max();
        System.out.println(max.getAsDouble());
        Comparator<Integer> comparator = Integer::compare;
    }
}
