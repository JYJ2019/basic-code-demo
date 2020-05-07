package cn.itcast.day06.demo02;

/*
当一个对象作为参数, 传递到方法当中时,
实际上传递进去的是对象的地址值
 */
public class Demo02PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "苹果";
        one.price = 8692.29;
        one.color = "土豪金";
        method(one);//传递进去的参数其实就是地址值
    }

    public static void method(Phone param) {
        System.out.println(param.brand);//苹果
        System.out.println(param.price);//8692.29
        System.out.println(param.color);//土豪金
    }
}
