package com.codegeekgao.designmodel.factory.staticfactory;

import com.codegeekgao.designmodel.factory.Calculate;
import com.codegeekgao.designmodel.factory.Dog;

import java.util.Optional;

/**
 * @author codegeekgao
 * @version Id: Animal.java, 2019/5/16 9:40 PM codegeekgao Exp $$
 */
public class Animal {

    // 吃荤的类型
    private static final int TYPE_EAT_MEAT = 0;
    // 吃素的类型
    private static final int TYPE_EAT_GRASS = 1;

    /**
     * 根据传入参数的不同返回不同类型的
     */
    public static Animal getInstance(int type) {
        // 这里可以返回父类Animal,也可以返回Tiger或者Lion，所以比构造器创建对象要更加灵活一些。
        if (TYPE_EAT_MEAT == type) {
            return new Tiger();
        }
        if (TYPE_EAT_GRASS == type) {
            return new Horse();
        }
        return new Animal();
    }


    public static <T> T getAnimal(Class c) throws IllegalAccessException, InstantiationException {

        T o = (T) c.newInstance();

        if (Animal.class.isInstance(o)) {
            return o;
        }

        return null;

    }


    public static void main(String[] args) throws Exception {
        Fish animal = Animal.getAnimal(Fish.class);
        Optional<Fish> fish = Optional.ofNullable(animal);
        if (!fish.isPresent()) {
            System.out.println("对象为null");
        } else {
            System.out.println("对象不为null:" + animal.getName());
        }
    }


}