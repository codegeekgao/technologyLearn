package com.codegeekgao.optional;

import com.codegeekgao.model.Employee;
import org.junit.Test;

import java.util.Optional;

/**
 * 测试Optional
 *
 * @author DonnieGao
 * @version Id: TestOptional.java, v 0.1 2018/5/4 下午6:52 DonnieGao Exp $$
 */
public class TestOptional {

    /**
     * 测试OptionalOF的null
     */
    @Test
    public void testOptionalOF() {
        Optional<Employee> optional = Optional.of(null);
        System.out.println(optional.get());
    }

    /**
     * 测试OptionalEmpty
     */
    @Test
    public void testOptionalEmpty() {
        // 构建空的Optional
        Optional<Employee> optional = Optional.empty();
        System.out.println(optional.get());
    }

    /**
     * 测试OptionalOfNull
     */
    @Test
    public void testNull() {
        Optional<Employee> optional = Optional.ofNullable(null);
        System.out.println(optional.get());
    }

    /**
     * 测试OptionalOrelse,map,FlatMap
     */
    @Test
    public void testOptionalOrElse() {
        Optional<Employee> optional = Optional.ofNullable(null);
        Employee employee = optional.orElse(new Employee("李四", 25, 20001D));
        Optional<String> s = optional.map(Employee::getName);// (e) -> e.getName()
        Optional<String> s1 = optional.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(s1);
        System.out.println(employee);
        Employee employee1 = optional.orElseGet(Employee::new);
        System.out.println(employee1);
    }


    private static int combinations(int down, int top) {
        int topProduct = 1, downProduct = 1;
        for (int i = 0; i < top; i++) {
            downProduct *= down;
            down--;
        }
        for (; top > 0; top--) {
            topProduct *= top;
        }
        //  System.out.println();
        return downProduct / topProduct;
    }


    @Test
    public void testCombinations() {
        int combinations = TestOptional.combinations(7, 4);
        System.out.println(combinations);
    }
}
