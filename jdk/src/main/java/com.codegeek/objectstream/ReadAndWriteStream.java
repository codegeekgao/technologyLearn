package com.codegeek.objectstream;

import com.codegeek.model.Employee;

import java.io.*;

/**
 * 对象读取流
 *
 * @author CodeGeekGao
 * @version Id: ReadAndWriteStream.java, v 0.1 2018/9/18 9:35 CodeGeekGao Exp $$
 */
public class ReadAndWriteStream {

    public static void main(String[] args) {
        try {
            // 输出对象
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream ous = new ObjectOutputStream(bao);
            Employee employee = new Employee();
            employee.setAge(10);
            employee.setName("Bob");
            employee.setSalary(10000D);
            ous.writeObject(employee);
            // 将对象转为字节
            byte[] bytes = bao.toByteArray();

            // 输入对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Employee o = (Employee)ois.readObject();
            System.out.println(o.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放io资源
        }
    }
}
