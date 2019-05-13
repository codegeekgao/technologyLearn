package com.codegeek.lambda;

import java.util.*;

/**
 * @author codegeekgao
 * @version Id: EmployeeTest.java, 2019/5/13 10:16 AM codegeekgao Exp $$
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // 假设在A部门有，青龙，白虎，朱雀，玄武 四个部门人员。下面是他们上个月基本薪资的情况
        Employee qingLong = new Employee("青龙", 25, 5500, 7500);
        Employee baiHu = new Employee("白虎", 27, 5000, 9000);
        Employee zhuQue = new Employee("朱雀", 22, 3800, 4500);
        Employee xuanWu = new Employee("玄武", 24, 3300, 3300);
        List<Employee> employees = Arrays.asList(qingLong, baiHu, zhuQue, xuanWu);


        employees.stream().filter(e -> e.getTotalSalary() > 5000d).map(Employee::getName).forEach(System.out::println);
        System.out.println();

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Integer age1 = o1.getAge();
                Integer age2 = o2.getAge();
                return age1.compareTo(age2);
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        employees.stream().sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge())).forEach(o -> System.out.println(o.getName()));
    }
}
