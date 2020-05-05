package cn.itcast.day04.demo01;

/*
注意事项:
对于有返回值的方法,可以使用单独调用,打印调用或者赋值调用
对于没有返回值的方法,只能使用单独调用.
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法,我来调用你
//        我调用你,你来帮我计算一下,算完了之后,把结果告诉我的number变量
        int number = getSum(2,3);
        System.out.println("返回值:" + number);
//        对于没有返回值的方法,只能使用单独调用.
        println(20,30);
        System.out.println(getSum(3,3));//正确写法,打印调用
        getSum(3,5);//正确写法,单独调用,但返回值没有被使用
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void println(int a, int b) {
        int result = a + b;
        System.out.println("结果是:" + result);
    }
}
