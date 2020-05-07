package cn.itcast.day06.demo02;

/*
当使用一个对象类型作为方法的返回值时:
返回值其实就是对象的地址值
 */
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8767.0
        System.out.println(two.color);//绿色
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8767.0;
        one.color = "绿色";

        return one;
    }
}