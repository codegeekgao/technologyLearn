package com.codegeekgao.designpattern.strategymode;

import java.util.List;

/**
 * @author DonnieGao
 * @version Id: MyfilterImpl.java, v 0.1 2018/8/28 上午9:40 DonnieGao Exp $$
 */
public class MyfilterImpl implements MyFilter<List<Integer>> {

    /**
     * 返回大于5的集合
     *
     * @param list
     * @return
     */
    @Override
    public boolean getWant(List<Integer> list) {
        boolean b = list.stream().anyMatch(i -> i > 5);
        return b;
    }
}
