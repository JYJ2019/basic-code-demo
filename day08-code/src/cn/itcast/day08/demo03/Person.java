package cn.itcast.day08.demo03;

public class Person {
    public Person() {
        System.out.println("构造方法执行!");
    }

    static {
        System.out.println("静态方法块执行!");
    }
}
