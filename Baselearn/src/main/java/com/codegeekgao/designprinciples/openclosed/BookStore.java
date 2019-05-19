package com.codegeekgao.designprinciples.openclosed;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * 书店
 *
 * @author codegeekgao
 * @version Id: BookStore.java, 2019/5/18 10:32 AM codegeekgao Exp $$
 */
public class BookStore {


    public static void main(String[] args) {
        // 出版书籍
        List<ComputerBook> computerBooks = Arrays.asList(
                new OffBook("机械工业出版社", BigDecimal.valueOf(119), "Effective java"),
                new OffBook("电子工业出版社", BigDecimal.valueOf(79), "小灰的算法之旅"),
                new OffBook("北京大学出版社", BigDecimal.valueOf(119), "Spring 5 开发大全"),
                new OffBook("人民邮电出版社", BigDecimal.valueOf(118), "鸟哥的Linux私房菜"));

       computerBooks.stream().forEach(e-> System.out.println("上架"+e.getPressName()+" "+e.getBookName()+" 价格为:"+e.getActivityPrice(BigDecimal.valueOf(0.8),BigDecimal.valueOf(100))));
    }
}
