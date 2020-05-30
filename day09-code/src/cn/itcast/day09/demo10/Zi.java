package cn.itcast.day09.demo10;

public class Zi extends Fu{
    int num = 20;

    public void show() {
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }

    @Override
    public void method() {
        super.method();
        System.out.println("子类的成员方法");
    }
}
