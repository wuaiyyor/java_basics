package com.wuaiyy.p2.swicthdemo;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个学生的成绩：");
        double score = input.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("您输入的成绩有误，请重新输入：");
        } else {
            int scoreNum = (int)(score / 10);
            String grade = "优秀";
            switch (scoreNum) {
                case 10:
                    // grade = "优秀";
                    // break; 直接穿透，实现代码的复用
                case 9:
                    // grade = "优秀";
                    break;
                case 8:
                    // grade = "良好";
                    // break; 直接穿透，实现代码的复用
                case 7:
                    grade = "良好";
                    break;
                case 6:
                    grade = "及格";
                    break;
                default:
                    grade = "不及格";
                    break;
            }
            System.out.println(grade);
        }
    }
}
