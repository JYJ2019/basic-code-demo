package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("====================");

        one.brand = "苹果";
        one.price = 8766.92;
        one.color = "red";

        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("======================");

        one.call("乔布斯");
        one.sendMessage();

    }
}
