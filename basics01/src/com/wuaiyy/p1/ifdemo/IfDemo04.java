package p2.ifdemo;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * 输入一个整数month代表月份，根据月份输出对应的季节。春季：3、4、5 夏季：6、7、8 秋季：9、10、11 冬季：12、1、2
 * 实现步骤：
 *      1.通过Scanner获得一个月份，假设使用mouth来保存月份
 *      2.根据月份输出对应的季节，使用if多选结构来实现（多选一）
 */
public class IfDemo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int mouth = input.nextInt();
        String season = "";
        if (mouth < 1 || mouth > 12) {
            System.out.print("你输入的月份有误，请重新输入");
        }
        else {
            if (mouth == 3 || mouth == 4 || mouth == 5) {
                season = "春季";
            }
            else if (mouth == 6 || mouth == 7 || mouth == 8) {
                season = "夏季";
            }
            else if (mouth == 9 || mouth == 10 || mouth == 11) {
                season = "秋季";
            }
            else {
                season = "冬季";
            }
            System.out.println(season);
        }
    }
}
