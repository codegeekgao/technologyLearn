package com.codegeek.function;

/**
 * @author DonnieGao
 * @version Id: FunctionAdd.java, v 0.1 2018/4/27 下午7:17 DonnieGao Exp $$
 */
@FunctionalInterface
public interface FunctionAdd<T, R> {

    /**
     * 传入参数为T类型的数据，返回R类型的数据
     *
     * @param t
     * @return
     */
    R paramAdd(T t);
}
