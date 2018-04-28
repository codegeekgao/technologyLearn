/**
 * Corearchi.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.codegeekgao.constructorreference;

import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造器引用测试
 *
 * @author gaoxinpeng
 * @version Id: ConstructorReferenceTest.java, v 0.1 2018/4/27 下午11:24 gaoxinpeng Exp $$
 */
public class ConstructorReferenceTest {

    // 对象::实例方法
    @Test
    public void testConsumer() {
        Consumer<String> consumer1 = (x) -> System.out.println();

        // 构造器引用要求：当前函数式接口的参数列表与返回值要与调用方法的返回值,参数列表一致
        Consumer<String> consumer2 = System.out::println;

        Employee emp = new Employee();
        Supplier<Integer> supplier = () -> emp.getAge();
        Supplier<Double> sup2 = emp::getSalary;
        System.out.println(supplier.get());
    }

    // 类::方法名
    @Test
    public void testSupplier() {
        Comparator<String> comparator = (x, y) -> x.compareTo(y);
        // 要求参数第一个值作为方法体的调用者，第二个参数值作为方法体的被调用者（参数）
        Comparator<String> compString = String::compareTo;
        System.out.println(comparator.compare("2", "3"));

        Comparator<Integer> com = Integer::compare;
        System.out.println(com.compare(1, 2));

        BiPredicate<String, String> predicate = String::equals;
        System.out.println(predicate.test("we", "eq"));

        /**  注意
         Lambda 体中调用方法的参数列表与返回值类型，要与函数式接口抽象方法的该函数列表和返回值类型保持一致。
         若Lambda参数列表中的第一个参数是实例方法的调用者，而第二个参数是实例方法的参数时。可以使用 ClassName :: method*/
    }

    // 构造器引用
    @Test
    public void test() {
        Supplier<Employee> supplier = () -> new Employee();
        Supplier<Employee> supplier1 = Employee::new;
        Function<Integer, Employee> function = Employee::new; //有参构造


        Function<String, char[]> function1 = (x) -> x.toCharArray();
        Function<String, char[]> function2 = (x) -> x.toCharArray();
        char[] apply = function1.apply("I love You!");
        for (char c : apply) {
            System.out.println(c);
        }

        // 数组引用
        // type[]::new
        Function<Integer, String[]> fun = String[]::new;
        Function<Integer, int[]> fun1 = int[]::new;
    }
}
