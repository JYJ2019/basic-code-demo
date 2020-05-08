package cn.itcast.day06.demo03;

/*
面向对象三大特性:封装,继承,多态

封装性在Java当中的体现:
1.方法就是一种封装
2.关键字private也是一种封装

封装就是将一些细节信息隐藏起来,对于外界不可见.
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 4, 5};
        int max = getMax(array);
        System.out.println(max);
    }

    //给我一个数组,我还给你一个最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( max < array[i])
            {
                max = array[i];
            }
        }
        return max;
    }
}