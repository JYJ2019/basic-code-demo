package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意变化的.

等于ArrayList来说,有一个尖括号<E>代表泛型.
泛型,也就是装在集合当中的所有元素,全都是统一的什么类型.
注意泛型只能是引用类型,不能是基本类型.
*/
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合,集合的名称是list,里面装的全都是String字符串类型的数据
        //备注:从JDk1.7+开始,右侧的尖括号内部可以不写内容,但是<>本身还是要写的.
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);
        //向集合当中添加一些数据,需要用到add方法
        list.add("赵丽颖");

        System.out.println(list);

        list.add("赵丽");
        list.add("赵");
        list.add("丽颖");

        System.out.println(list);

//        list.add(100);//错误写法!因为创建的时候尖括号泛型已经说了是字符串,添加进去的元素就必须都是字符串才行
    }
}
