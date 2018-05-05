/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.stream;

import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author DonnieGao
 * @version Id: FinshStream.java, v 0.1 2018/4/28 下午10:49 DonnieGao Exp $$
 */
public class FinshStream {


    @Test
    public void test() {
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 23, 3000d),
                new Employee("李四", 24, 4000d),
                new Employee("王五", 25, 5000d),
                new Employee("招六", 29, 6000d),
                new Employee("八七", 27, 7000d),
                new Employee("八七", 27, 7000d)
        );

        // 避免空指针异常
        Optional<Employee> optional = employees.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).findFirst();
        // 若空指针异常就怎么处理
        optional.orElse(new Employee());
        System.out.println(optional);

        // 返回任意一个(并行开启多个线程查找)
        Optional<Employee> any = employees.parallelStream().filter((e) -> e.getAge() > 25).findAny();
        System.out.println(any);

        // Max(Comparator按年龄比较)
        Optional<Employee> max = employees.stream().max(Comparator.comparing((e) -> e.getAge()));
        System.out.println(max);
        Optional<Double> max1 = employees.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(max1.get());

        // 流中元素接收，计算得到一个
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, (x, u) -> x + u);//0+1+2.....+10
        System.out.println(reduce);

        Optional<Integer> reduce1 = employees.stream().map(Employee::getAge).reduce(Integer::sum);
        System.out.println(reduce1.get() + "----------");

        // 收集元素到list
        employees.stream().map(Employee::getName).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        // 收集元素到LinkList
        employees.stream().map(Employee::getName).distinct().collect(Collectors.toCollection(HashSet::new)).forEach(System.out::println);

        // 获取流中最大值
        Optional<Integer> max2 = employees.stream().map(Employee::getAge).max(Integer::compare);
        System.out.println(max2.get());

        // 收集获取总数(集合总数)
        Long collect = employees.stream().collect(Collectors.counting());
        System.out.println(collect);

        // 工资的平均值
        Double collect1 = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(collect1);

        // 获取工资的总数，综合，最小值，平均值，最大值
        DoubleSummaryStatistics collect2 = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(collect2);

        // 获取年龄最大的员工
        Optional<Employee> collect3 = employees.stream().collect(Collectors.maxBy((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())));
        System.out.println(collect3.get());

        // 获取年龄最小的员工
        Optional<Double> collect4 = employees.stream().map(Employee::getSalary).collect(Collectors.minBy(Double::compare));
        System.out.println(collect4.get());

        // 按薪资分组
        Map<Double, List<Employee>> collect5 = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(collect5);

        // 薪资分区(匹配true)
        Map<Boolean, List<Employee>> collect6 = employees.stream().collect(Collectors.partitioningBy((e) -> e.getSalary() > 5000d));
        System.out.println(collect6);
    }
}
