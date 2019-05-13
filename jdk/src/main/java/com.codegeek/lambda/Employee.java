package com.codegeek.lambda;

import lombok.*;

/**
 * 员工基类
 *
 * @author codegeekgao
 * @version Id: Employee.java, 2019/5/13 10:05 AM codegeekgao Exp $$
 */
@Setter
@Getter
@NoArgsConstructor
public class Employee {
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工年龄
     */
    private Integer age;
    /**
     * 基本薪水
     */
    private Double basicSalary;

    /**
     * 订单成交总额
     */
    private Double dealTotalPrice;

    public Employee(String name, int age, double basicSalary,double dealTotalPrice) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.dealTotalPrice = dealTotalPrice;
    }

    /**
     * 员工总薪资
     *
     * @return Double
     */
    public Double getTotalSalary() {
        return this.basicSalary + this.dealTotalPrice * 0.04;
    }

}
