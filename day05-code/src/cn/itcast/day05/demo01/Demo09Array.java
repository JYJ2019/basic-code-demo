package cn.itcast.day05.demo01;

/*
遍历数组,说的就是对数组当中的每一个元素进行逐一,挨个儿处理.默认的处理方式就是打印输出.
 */
public class Demo09Array {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
