package com.codegeekgao.LambdaTest;

import com.codegeekgao.interfaces.MyFilter;
import com.codegeekgao.interfaces.MyFilterImpl;
import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.*;

/**
 * Lambda的测试类
 *
 * @author DonnieGao
 * @version Id: LambdaTest.java, v 0.1 2018/4/25 下午10:
 *          <p>
 *          DonnieGao Exp $$
 */
public class LambdaTest {

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
