package cn.itcast.day04.demo01;
/*
有参数
无参数
 */

public class Demo03MethodParam {
    public static void main(String[] args) {
        //调用
        method1(2,3);
        System.out.println("===========");
        method2();
    }

    //  两个数字相乘
//    有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是:" + result);
    }

    //无参数 例如打印10次
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }
    }
}
