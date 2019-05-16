package com.codegeekgao.designmodel.factory;

/**
 * @author codegeekgao
 * @version Id: Calculate.java, 2019/5/16 11:16 AM codegeekgao Exp $$
 */
public class Calculate {

    private static int combinations(int down, int top) {
        int topProduct = 1, downProduct = 1;
        // 这里是计算分子上即6*5
        for (int i = 0; i < top; i++) {
            downProduct *= down;
            down--;
        }
        // 这里计算是1*2
        for (; top > 0; top--) {
            topProduct *= top;
        }

        // 所以计算的是30/2的值
        return downProduct / topProduct;
    }


    public static void main(String[] args) {
        // 6个选2个，分子计算的是6*5/1*2，同理7个选4个就是7*6*5*4/1*2*3*4=35
        int combinations = Calculate.combinations(6, 2);
        System.out.println(combinations);
    }
}

