package com.codegeekgao.designmodel.builder.phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author codegeekgao
 * @version Id: PhoneDirector.java, 2019/5/17 1:55 PM codegeekgao Exp $$
 */
@Data
@NoArgsConstructor
public class PhoneDirector {


    private PhoneBuilder construct() {
       return new PhoneBuilder(new Phone());
    }


    public static void main(String[] args) {
        PhoneDirector phoneDirector = new PhoneDirector();
        PhoneBuilder builder = phoneDirector.construct();
        builder.buildScreen("三星的显示屏");
        builder.buildCpu("英特尔处理器");
        builder.buildBattery("南孚的电池");
        builder.buildMemory("希捷的内存");
        System.out.println(builder.build());
    }
}
