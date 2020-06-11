package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodDefault1() {
        System.out.println("默认方法1");
        methodStatic();
    }

    public static void methodDefault2() {
        System.out.println("默认方法2");
        methodStatic();
    }

    private static void methodStatic() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
