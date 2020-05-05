package cn.itcast.day04.demo01;

/*
题目要求:
定义一个方法,用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(20,30));//false
        System.out.println(isSame(10,10));//true
    }

    /*
    三要素:
    返回值类型:boolean
    方法名称: isSame
    参数列表:int a, int b
     */
    public static boolean isSame(int a, int b) {
        return a == b;
    }
}
