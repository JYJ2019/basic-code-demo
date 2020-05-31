package cn.itcast.day09.demo14_01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, double leftMoney) {
        super(name, leftMoney);
    }

    //打开红包,就是从集合中,随机取出一份,保存到自己的余额中
    public void openHongbao(ArrayList<Double> list) {
        //创建Random对象
        Random random = new Random();
        //随机生成一个角标
        int index = random.nextInt(list.size());
        //移除一个金额
        Double money = list.remove(index);
        //直接调用父类方法,设置余额
        super.setLeftMoney(money);
    }
}
