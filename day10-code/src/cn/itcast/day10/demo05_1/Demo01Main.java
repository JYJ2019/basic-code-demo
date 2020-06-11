package cn.itcast.day10.demo05_1;

public class Demo01Main {
    public static void main(String[] args) {
        //如果不用多态,只使用子类,那么写法是:
        /*Teacher one = new Teacher();
        one.work();//讲课
        Assistant two = new Assistant();
        two.work();//辅导*/

        //现在唯一要做的事情,就是调用work方法,其他功能不关心

        //如果使用多态的写法,对比一下
        Employee one = new Teacher();
        one.work();//讲课
        Employee two = new Assistant();
        two.work();//辅导

        //好处:无论右边new的时候换成哪个子类对象,等号左边调用方法都不会变化.
    }
}
