package cn.itcast.day05.demo01;

/*
如何获取数组长度,格式:
数组名称.length

这将会得到一个int数字,代表数组长度.
数组一旦创建,程序运行期间,长度不可变.
 */
public class Demo08ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {2, 3, 2, 3, 4, 5, 34, 345, 345, 345, 34, 54, 35, 43, 5, 1, 2312, 31, 2};
        int len = arrayB.length;

        System.out.println("arrayB数组的长度是:" + len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println(arrayC.length);//5
        //在内存里相当于两个数组,arrayC是管理者

    }
}
