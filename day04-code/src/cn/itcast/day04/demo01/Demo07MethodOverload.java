package cn.itcast.day04.demo01;

/*
方法的重载(Overload): 多个方法的名称一样,但是参数列表不一样.
好处:只需要记住唯一一个方法名称,就可以实现类似的多个功能.

方法重载与下列因素相关:
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关:
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class Demo07MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));//3
        System.out.println(sum(1,2,3));//6
        System.out.println(sum(1,2,3,4));//10
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(double a,double b) {//参数类型不同
        return (int) (a + b);
    }

    public static int sum(double a,int b) {
        return (int)(a + b);
    }

    public static int sum(int a, double b) {
        return (int)(a + b);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
