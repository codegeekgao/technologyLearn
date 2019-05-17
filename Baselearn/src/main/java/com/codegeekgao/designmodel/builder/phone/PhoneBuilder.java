package com.codegeekgao.designmodel.builder.phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author codegeekgao
 * @version Id: PhoneBuilder.java, 2019/5/17 1:56 PM codegeekgao Exp $$
 */

@NoArgsConstructor
public class PhoneBuilder implements Builder {

    private Phone phone;


    public PhoneBuilder(Phone phone) {
        this.phone = phone;
    }

    public Phone build() {
        return this.phone;
    }

    @Override
    public void buildScreen(String str) {
        phone.setScreen(str);
    }

    @Override
    public void buildMemory(String str) {
        phone.setMemory(str);
    }

    @Override
    public void buildBattery(String str) {
        phone.setBattery(str);
    }

    @Override
    public void buildCpu(String str) {
        phone.setCpu(str);
    }

}
