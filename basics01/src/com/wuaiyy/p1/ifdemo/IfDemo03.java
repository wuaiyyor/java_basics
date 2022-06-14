package com.wuaiyy.p1.ifdemo;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个学生的成绩:");
        double score = input.nextDouble();
        String grander = "";
        if (score < 0.0 || score > 100.0) {
            System.out.println("您输入的成绩有误，请重新输入");
        } else {
            if (score >= 90) {
                grander = "优秀";
            } else if (score >= 70) {
                grander = "良好";
            } else if (score >= 60) {
                grander = "及格";
            } else {
                grander = "不及格";
            }
            System.out.println("您的等级是：" + grander);
        }
    }
}
