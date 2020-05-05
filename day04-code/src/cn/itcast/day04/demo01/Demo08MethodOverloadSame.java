package cn.itcast.day04.demo01;

/*
比较两个数据是否相等。
参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，
并 在 main 方法中进行测试。
 */
public class Demo08MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        isSame(a, b);
        isSame((short)10,(short)20);
        isSame(10,20);
        isSame(10L,10L);
    }

    public static boolean isSame(byte a , byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long");
        return a ==b;
    }
}
