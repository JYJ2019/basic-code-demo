package cn.itcast.day05.demo03;

/*
传递的地址值,地址值没有发生变化
总结: 方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值.
 */
public class Demo02Change {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);//1
        change(array);
        System.out.println(array[0]);//200
    }

    public static void change(int[] array) {
        array[0] = 200;
    }
}
