package com.codegeekgao.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 *  员工实体类
 *
 * @author DonnieGao
 * @version Id: Employee.java, v 0.1 2018/4/25 下午11:46 DonnieGao Exp $$
 */
@Data
@AllArgsConstructor
public class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;
}
