package cn.itcast.day09.demo02;

public class Fu {
    int numFu = 10;
    int num = 1010;

    public void methodFu() {
        //使用的是本类当中的,不会向下找子类的
        System.out.println(num);
    }
}
