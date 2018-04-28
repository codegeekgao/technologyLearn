package com.codegeekgao.stream;

import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream的测试
 *
 * @author DonnieGao
 * @version Id: StreamProduce.java, v 0.1 2018/4/28 下午3:25 DonnieGao Exp $$
 */
public class StreamProduce {

    @Test
    public void getStream() {
        // 通过Collection系列集合提供的Stream()或者parallelStream
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream(); //串行流
        Stream<String> stringStream = list.parallelStream(); // 并行流

        // 通过Arrays中的静态方法Stream() 获取数组流
        Employee[] employees = new Employee[10];
        Stream<Employee> emStream = Arrays.stream(employees);

        // 通过Stream类中的静态方法of()
        Stream<String> stringStream1 = Stream.of("1", "2", "3"); // 底层还是Arrays.stream

        // 创建无限流
        // 迭代
        Stream<Integer> iterate = Stream.iterate(1, (x) -> x + 2);
        // iterate.forEach(System.out::println);
        iterate.limit(10).forEach(System.out::println); // 遍历只获取10个元素

        // 创建无限流
        // 生成
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.limit(10).forEach(System.out::println);
    }
}
