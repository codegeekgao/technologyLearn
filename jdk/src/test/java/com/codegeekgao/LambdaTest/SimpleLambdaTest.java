package com.codegeekgao.LambdaTest;

import com.codegeekgao.interfaces.MyFilter;
import com.codegeekgao.interfaces.MyFilterImpl;
import com.codegeek.model.Employee;
import org.junit.Test;

import java.security.PublicKey;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lambda的测试类
 *
 * @author DonnieGao
 * @version Id: SimpleLambdaTest.java, v 0.1 2018/4/25 下午10:
 */
public class SimpleLambdaTest {

    // 原来的匿名内部类方法
    @Test
    public void testPrevious() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(01, 02);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(com);
    }

    @Test
    public void testSimpleLambda() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
    }

    public static List<Employee> init() {
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 23, 6000d),
                new Employee("李四", 24, 6100d),
                new Employee("王五", 25, 7000d),
                new Employee("赵六", 26, 8000d)
        );
        return employees;
    }

    /**
     * 获取年龄大于24的
     */
    @Test
    public void testEmployee() {

        List<Employee> employees = init();
        List<Employee> employees1 = new ArrayList<Employee>();
        // 传统遍历的方式
        for (Employee employee : employees) {
            if (employee.getAge() >= 24) { // 可以原先的比较，也可以使用策略模式
                System.out.println(employee
                );
            }
        }
        System.out.println("------分割线--------");
        // jdk8遍历
        employees.forEach(System.out::println);
    }

    @Test
    public void testFunction() {
        List<Employee> employees = init();
        Function<List<Employee>, String> function = e -> e.stream().findFirst().get().toString();
        System.out.println(function);
    }

    /**
     * 策略设计模式
     */
    public List<Employee> needEmployee(List<Employee> employeeList, MyFilter<Employee> filter) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (filter.getWant(employee)) {
                employees.add(employee);
            }
        }

        return employees;
    }

    @Test
    public void test() {
        String[] arr = {"java", "scala", "php", "python", "c++"};
        Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);
        int[] array = {1, 4, 6, 7, 12};
        Arrays.stream(array).mapToDouble(e -> e * 100).forEach(System.out::println);
        Arrays.stream(array).mapToLong(e -> e + 23).forEach(System.out::println);
        List<List<String>> database = new ArrayList<>();
        List<String> noSql = Arrays.asList("redis", "hbase", "membercache");
        List<String> sql = Arrays.asList("mysql", "oracle", "db2");
        database.add(noSql);
        database.add(sql);
        List<String> h = database.stream().flatMap(s -> s.stream().filter(si -> si.contains("h"))).collect(Collectors.toList());
        h.stream().forEach(System.out::println);
    }

    /***
     * 使用策略模式获取值
     */
    @Test
    public void method1() {
        // 方法1
        List<Employee> employees = needEmployee(init(), new MyFilterImpl());
        employees.forEach(System.out::println);

        // 匿名内部类
        List<Employee> employees1 = needEmployee(init(), new MyFilter<Employee>() {
            @Override
            public boolean getWant(Employee employee) {
                return employee.getAge() >= 24;
            }
        });
        employees.forEach(System.out::println);

        // 方式三
        List<Employee> employees2 = needEmployee(init(), employee -> employee.getAge() >= 24);
        employees.forEach(System.out::println);
        System.out.println();

        // 最简便方式4
        employees.stream().filter(employee -> employee.getAge() > 24).forEach(System.out::println);

        // 获取年龄大于所有人的名字
        employees.stream().filter(employee -> employee.getAge() > 25).map(Employee::getName).forEach(System.out::println);
    }
}
