package com.codegeekgao.designModel.factory;

/**
 * 具体类狗
 */
public class Dog implements Pet {

    /**
     * 狗发声的方法
     * @return String
     */
    @Override
    public String petSound() {
        return "汪汪";
    }
}
