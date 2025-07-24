package com.yzy.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // 短路运算符，当作变得运算符能确定最终的结果，就不会执行后面的运算
        // 逻辑与，当第一个表达式为false时，后面的表达式就不会执行
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // 逻辑或，当第一个表达式为true时，后面的表达式就不会执行
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = 20;
        boolean result2 = ++c < 5 & ++d < 5;
        System.out.println(result2);
        System.out.println(c);
        System.out.println(d);
    }
}
