package com.codegeekgao.designmodel.builder.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author codegeekgao
 * @version Id: Pizza.java, 2019/5/21 9:45 PM codegeekgao Exp $$
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        //   create a second set which is empty
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        // 复制builder对象的值
        toppings = builder.toppings.clone();
    }

}


