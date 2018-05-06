
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
        Optional<Employee> optional = Optional.ofNullable(new Employee("张三", 24, 2000D));
        Employee employee = optional.orElse(new Employee("张三", 24, 2000D));
        Optional<String> s = optional.map(Employee::getName);// (e) -> e.getName()
        Optional<String> s1 = optional.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(s1);
        System.out.println(s.get());
        System.out.println(employee);
        Employee employee1 = optional.orElseGet(() -> new Employee());
        System.out.println(employee1);
    }
}
