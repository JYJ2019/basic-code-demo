package cn.itcast.day09.demo14_01;

import java.util.ArrayList;
import java.util.List;

public class QunZhu extends User {
    //添加构造方法
    public QunZhu() {
    }

    public QunZhu(String name, double leftMoney) {
        //通过super 调用父类构造方法
        super(name, leftMoney);
    }

    /*
    群主发红包,就是把一个整数的金额,分层若干等份.
    1.获取群主余额,是否够发红包.
        不能则返回null,并提示.
        能则继续.
    2.修改群主余额.
    3.拆分红包.
        3.1如果能整除,那么就平均分
        3.2如果不能整除,那么就把余数分给最后一份
    4.群主想输入带小数的金额  double money
     */

    public ArrayList<Double> send(double money, int count) {
        //创建一个集合保存等份金额
        ArrayList<Double> list = new ArrayList<>();

        //获取群余额
        double leftMoney = super.getLeftMoney();

        // 判断,如果余额不足
        if (money > leftMoney) {
            System.out.println("余额不足......");
            return list;
        }

        //修改群主余额
        super.setLeftMoney(leftMoney - money);



        //扩大100倍,相当于拆分成'分'为单位,避免小数运算损失精度的问题
        money *= 100;

        //每份的金额
        int m = (int) (money) / count;
        //不能整除的数
        int l = (int) (money) % count;

        //无论是否整除,n - 1份,都是每份的等额金额
        for (int i = 0; i < count - 1; i++) {
            //缩小100倍,折算成'元'
            list.add(m / 100.0);
        }

        //添加最后一个红包
        list.add((m + l) / 100.0);

        return list;

    }

}
