package com.codegeekgao.designmodel.builder.pizza;

import java.util.Objects;

/**
 * @author codegeekgao
 * @version Id: NyPizza.java, 2019/5/21 9:52 PM codegeekgao Exp $$
 */
public class NyPizza extends Pizza {

    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Pizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
