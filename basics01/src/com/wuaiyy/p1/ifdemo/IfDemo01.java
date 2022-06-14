package com.wuaiyy.p1.ifdemo;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String userName = input.next();
        System.out.println("请输入您的密码：");
        String password = input.next();
        if (userName.equals("admin") && password.equals("123456")) {
            System.out.println("登录成功");
        } else {
            System.out.println("你输入的用户名或者密码有误");
        }
    }
}
