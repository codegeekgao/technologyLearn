package com.codegeekgao.mapToBean;

import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author codegeekgao
 * @version Id: Student.java, 2019/4/23 12:28 PM codegeekgao Exp $$
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {

    private String name;

    private int age;

    private double salary;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
