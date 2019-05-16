package com.codegeekgao.designmodel.factory;

import lombok.*;

/**
 * @author codegeekgao
 * @version Id: Student.java, 2019/5/16 12:52 AM codegeekgao Exp $$
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Student {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 年级
     */
    private int schoolGrade;
    /**
     * 学校
     */
    private String schoolName;

    /**
     * 班级
     */
    private String schoolClass;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static Student method1(String name, int age) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        return student;
    }

    public Student(String name, int age, int schoolGrade, String schoolName, String schoolClass) {
        this.name = name;
        this.age = age;
        this.schoolGrade = schoolGrade;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
    }


    public static Student method2(String name, int age, int schoolGrade, String schoolName, String schoolClass) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.schoolGrade = schoolGrade;
        student.schoolName = schoolName;
        student.schoolClass = schoolClass;
        return student;
    }

    public Student(int schoolGrade, String schoolName, String schoolClass) {
        this.schoolGrade = schoolGrade;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
    }

    public static Student method3(int schoolGrade, String schoolName, String schoolClass) {
        Student student = new Student();
        student.schoolGrade = schoolGrade;
        student.schoolName = schoolName;
        student.schoolClass = schoolClass;
        return student;
    }

    public static void main(String[] args) {
        Student student = Student.method1("张三", 23);
        System.out.println(student);
    }
}
