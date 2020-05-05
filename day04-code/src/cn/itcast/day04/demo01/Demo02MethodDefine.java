package cn.itcast.day04.demo01;
//计算两个值的和(用方法)
/*方法的三种调用格式
        1.单独调用
        2.打印调用
        3.赋值调用
        返回值类型为void的只能单独调用
        */

public class Demo02MethodDefine {
    public static void main(String[] args) {
//        单独调用
        getSum(2,4);
        System.out.println("==================");
//        打印调用
        System.out.println(getSum(3,2));
        System.out.println("==================");
//        赋值调用
        int number = getSum(40, 5) + 100;
        System.out.println("值为:" + number);
    }

    public static int getSum(int a, int b) {
        System.out.println("方法调用成功");
        int result = a + b;
        return result;
//        return a + b;
    }

}
