package com.yzy.test;

import java.util.Scanner;

public class Test1 {
    //键盘输入一个三位数，输出其中的个位，十位，百位
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
