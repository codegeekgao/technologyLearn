package com.codegeekgao.designmodel.builder.phone;

/**
 * @author codegeekgao
 * @version Id: Builder.java, 2019/5/17 1:56 PM codegeekgao Exp $$
 */
public interface Builder {

    void buildScreen(String str);

    void buildMemory(String str);

    void buildBattery(String str);

    void buildCpu(String str);
}
