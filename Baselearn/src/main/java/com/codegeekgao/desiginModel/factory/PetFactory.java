/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.factory;

/**
 * 宠物工厂实现类
 *
 * @author codegeekgao
 * @version Id: PetFactory.java, v 0.1 2018/12/24 0024 14:11 Administrator Exp $$
 */
public class PetFactory {

    public Pet getPet(String petType) {
        Pet pet = null;
        if ("汪汪".equals(petType)) {
            pet = new Dog();
        } else {
            pet = new Cat();
        }
        System.out.println(pet.getClass());
        return pet;
    }

    /**
     * 工厂方法模式:当需要创建一个类，而在编程时不能确定这个类的类型时(需要运行时候确定)----参考不同彩种拆票的案列(具有产品树和产品族的场景)
     * 当一个类希望由其子类来指定所创建对象的具体类型，这里可以在日志记录功能需要用到工厂方法模式,比如文件日志，数据库记录，控制台日志记录
     */
    public static void main(String[] args) {
        // 创建工厂方法
        PetFactory petFactory = new PetFactory();
        Pet pet = petFactory.getPet("喵喵");
        // 光看Pet你并不确切知道创建的是那个对象工厂
        System.out.println(pet.petSound());
    }
}