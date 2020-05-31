package cn.itcast.day09.demo14_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建一个群主对象
        QunZhu qunZhu = new QunZhu("群主", 200);

        //创建一个键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额:");
        double money = sc.nextDouble();
        System.out.println("请输入人数:");
        int count = sc.nextInt();

        //发送红包
        ArrayList<Double> sendList = qunZhu.send(money, count);

        // 创建三个成员
        Member one = new Member("群员1", 0);//想要成员余额不为0,就修改leftMoney
        Member two = new Member("群员2", 0);
        Member three = new Member("群员3", 0);

        // 打开红包
        one.openHongbao(sendList);
        two.openHongbao(sendList);
        three.openHongbao(sendList);

        // 展示信息
        qunZhu.show();
        one.show();
        two.show();
        three.show();


    }
}
