package cn.itcast.day09.demo14_01;

public class User {
    //成员变量
    private String name;    //用户名
    private double leftMoney;   //余额

    //构造方法


    public User() {
    }

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    //get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    //展示信息方法
    public void show() {
        System.out.println("用户名:" + name + ",余额为:" + leftMoney);
    }
}
