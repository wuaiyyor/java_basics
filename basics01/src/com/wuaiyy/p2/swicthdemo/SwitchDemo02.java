package com.wuaiyy.p2.swicthdemo;

import java.util.Scanner;

public class SwitchDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个水果名字：");
        String fruit = input.next();
        switch (fruit) {
            case "苹果":
                System.out.println("苹果6块/斤");
                break;
            case "香蕉":
                System.out.println("香蕉3块/斤");
                break;
            case "榴莲":
                System.out.println("榴莲20块/斤");
                break;
            case "西瓜":
                System.out.println("西瓜0.8块/斤");
                break;
            default:
                System.out.println("你需要的水果太畅销了，已经售罄");
        }
    }
}
