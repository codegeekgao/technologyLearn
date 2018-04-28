package com.codegeekgao.stream;

import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 中间流操作
 *
 * @author DonnieGao
 * @version Id: MiddleStreamOperate.java, v 0.1 2018/4/28 下午4:08 DonnieGao Exp $$
 */
public class MiddleStreamOperate {

    @Test
    public void testFilter() {
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 23, 3000d),
                new Employee("李四", 24, 4000d),
                new Employee("王五", 25, 5000d),
                new Employee("招六", 26, 6000d),
                new Employee("八七", 27, 7000d),
                new Employee("八七", 27, 7000d)
        );
        // filter排除某些元素
        employees.stream().filter((e) -> e.getSalary() > 4500d).forEach(System.out::println);
        System.out.println();
        // limit 限制元素数量
        employees.stream().filter((e) -> e.getAge() >= 25).limit(1).forEach(System.out::println);
        System.out.println();
        // skip跳过元素
        employees.stream().skip(2L).limit(2).forEach(System.out::println);
        System.out.println();
        employees.stream().distinct().forEach(System.out::println);
    }
}
