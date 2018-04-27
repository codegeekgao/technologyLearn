/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeek;

import com.codegeek.function.FunctionAdd;
import com.codegeek.function.FunctionTest;
import com.codegeek.model.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式练习
 *
 * @author gaoxinpeng
 * @version Id: LambdaExercise.java, v 0.1 2018/4/27 上午12:18 gaoxinpeng Exp $$
 */

public class LambdaExercise {
    // 比较两个员工类，先按年龄比，再用姓名比

    public static List<Employee> init() {
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 23, 6000d),
                new Employee("李四", 24, 6100d),
                new Employee("王五", 25, 7000d),
                new Employee("赵六", 26, 8000d)
        );
        return employees;
    }

    public static void CompareValue() {

        Comparator<Employee> comparator = (x, y) -> {
            int age1 = y.getAge();
            int age2 = x.getAge();
            String name1 = y.getName();
            String name2 = x.getName();
            return age1 != age2 ? Integer.compare(age1, age2) : name2.compareTo(name1);
        };
        List<Employee> init = init();
        Collections.sort(init, comparator);
        init.forEach(System.out::println);
    }


    public static String get() {
        // 声明函数式接口，使用Lambda完成将字符串大写，并将第一个索引的值和第三个截取

        FunctionTest<String> function = (x) -> x.toUpperCase().substring(0, 3);
        return function.getWant("absDx");
    }

    public static Long add() {
        FunctionAdd<String, Long> function = (x) -> Long.valueOf(x);
        return function.paramAdd("1");
    }

    public static void main(String[] args) {
        CompareValue();
        System.out.println(get());
        System.out.println(add());
    }
}
