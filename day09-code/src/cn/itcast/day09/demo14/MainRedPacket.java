package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员1", 0);
        Member two = new Member("成员2", 0);
        Member three = new Member("成员3", 0);

        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("===============================");

        //群主总共发20块钱分成3个红包
        ArrayList<Integer> list = manager.send(20, 3);
        //三个普通成员收红包
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();//100 - 20 = 80

        // 8,6,6 随机分给3个人
        one.show();
        two.show();
        three.show();

    }
}
