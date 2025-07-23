package com.yzy.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(3 - 2);
        System.out.println(3 * 2);

        // 如果在计算的时候有小数参与
        // 在代码中，如果有小数参与运算，有可能是不精确的
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
