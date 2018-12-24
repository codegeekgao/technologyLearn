/**
 * zlc.com Inc.
 * Copyright (c) 2018-2018 All Rights Reserved.
 */
package com.codegeekgao.desiginModel.creativedesignpattern.factory;

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
        return pet;
    }


    public static void main(String[] args) {
        // 创建工厂方法
        PetFactory petFactory = new PetFactory();
        Pet pet = petFactory.getPet("汪汪");
        // 此时你并不确切知道创建的是那个对象工厂
        System.out.println(pet.petSound());
    }
}