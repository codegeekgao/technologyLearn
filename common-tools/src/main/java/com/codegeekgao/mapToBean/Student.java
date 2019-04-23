package com.codegeekgao.mapToBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author codegeekgao
 * @version Id: Student.java, 2019/4/23 12:28 PM codegeekgao Exp $$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;

    private int age;

    private double salary;
}
