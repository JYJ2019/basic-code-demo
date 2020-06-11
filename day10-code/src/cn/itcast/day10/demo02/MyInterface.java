package cn.itcast.day10.demo02;

public interface MyInterface {
    public default void method() {
        System.out.println("默认方法");
    }
}
