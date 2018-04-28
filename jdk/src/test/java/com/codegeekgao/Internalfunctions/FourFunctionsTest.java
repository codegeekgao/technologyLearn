package com.codegeekgao.Internalfunctions;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author DonnieGao
 * @version Id: FourFunctionsTest.java, v 0.1 2018/4/27 下午10:49 DonnieGao Exp $$
 */
public class FourFunctionsTest {

    // 函数式接口
    @Test
    public void testConsumer() {
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(1);
    }

    // 供给式接口
    @Test
    public void testSupplier() {
        Supplier<String> supplier = () -> {
            StringBuffer sb = new StringBuffer();
            return sb.append("我").append(520).append("you").toString();
        };
        System.out.println(supplier.get());
    }

    // 断言式接口
    @Test
    public void testPredicate() {
        Predicate<Long> predicate = (x) -> x == 1L;
        System.out.println(predicate.test(2L));
    }

    // 函数式接口
    @Test
    public void testFunction() {
        Function<Integer, Boolean> function = (x) -> x > 3;
        System.out.println(function.apply(4));
    }
}
