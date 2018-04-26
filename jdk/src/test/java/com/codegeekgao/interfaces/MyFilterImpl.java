package com.codegeekgao.interfaces;

import com.codegeekgao.model.Employee;

/**
 * 接口实现类
 *
 * @author DonnieGao
 * @version Id: MyFilterImpl.java, v 0.1 2018/4/26 上午12:32 DonnieGao Exp $$
 */
public class MyFilterImpl implements MyFilter<Employee> {
    /**
     * 获取指定想要的employee对象
     *
     * @param employee
     * @return
     */
    @Override
    public boolean getWant(Employee employee) {
        return employee.getAge() >= 24;
    }
}
