package com.wuaiyy.p1.ifdemo;

import java.util.Scanner;

public class IfDemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入时：");
        int hour = input.nextInt();
        System.out.print("请输入分：");
        int minute = input.nextInt();
        System.out.print("请输入秒：");
        int second = input.nextInt();
        if (++second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        String secondStr = second > 10 ? "" + second : "0" + second;
        String minuteStr = minute > 10 ? "" + minute : "0" + minute;
        String hourStr = hour > 10 ? "" + hour : "0" + hour;
        System.out.println(hourStr + ":" + minuteStr + ":" +secondStr);
    }
}
