package cn.itcast.day07.demo02;

import java.util.Scanner;

//匿名对象作为方法的参数和返回值
public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方法
//      Scanner sc = new Scanner(System.in);
//      int num = sc.nextInt();
//      System.out.println("值为:" + num);

        //匿名对象的方法
//      int num = new Scanner(System.in).nextInt();
//      System.out.println("值:" + num);

        //使用一般写法传入参数
//      Scanner sc = new Scanner(System.in);
//      methodParam(sc);

        //使用匿名对象来进行传参
//      methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("值:" + num);
    }

    //匿名对象作为参数
    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("值:" + num);
    }

    //匿名对象作为返回值
    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
