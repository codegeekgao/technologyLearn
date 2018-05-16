package com.codegeekgao.stream;

import com.codegeek.function.FunctionAdd;
import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
        Runnable runnable = System.out::println;

        System.out.println();
        // limit 限制元素数量
        employees.stream().filter((e) -> e.getAge() >= 25).limit(1).forEach(System.out::println);
        System.out.println();
        // skip跳过元素
        employees.stream().skip(2L).limit(2).forEach(System.out::println);
        System.out.println();
        // 去重
        employees.stream().distinct().forEach(System.out::println);

        // 排序
        employees.stream().sorted((e1, e2) -> {
            return e1.getAge() == e2.getAge() ? e1.getName().compareTo(e2.getName()) : e1.getAge().compareTo(e2.getAge());
        }).forEach(System.out::println);
    }

    // map映射
    @Test
    public void testMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        list.stream().map((str) -> str.toUpperCase()).forEach(System.out::println);
        // 匹配所有元素大于2的
        System.out.println(list.stream().allMatch((x) -> x.length() > 2));
        FunctionAdd<String, Stream<Character>> filterCharacter = MiddleStreamOperate::filterCharacter;
        Stream<Stream<Character>> streamStream = list.stream().map(MiddleStreamOperate::filterCharacter);// 将集合每个元素都映射
        streamStream.forEach(
                (sm) -> sm.forEach(System.out::println)// {{aa},{bb},{cc}} 将每个元素映射一个流，然后再将每个流映射一个大流
        );

        Stream<Character> characterStream = list.stream().flatMap(MiddleStreamOperate::filterCharacter);
        characterStream.forEach(System.out::println);// {a,a,b,b,c,c} // 将所有元素映射到一个流中

    }

    /**
     * 自定义返回的Stream
     *
     * @param str
     * @return
     */
    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();

        for (Character ch : str.toCharArray()) {
            list.add(ch);
        }
        return list.stream();
    }
}
