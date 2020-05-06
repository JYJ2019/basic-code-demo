package cn.itcast.day05.demo01;

/*
数组元素的反转:
本来的样子:[ 1, 2, 3, 4]
之后的样子:[ 4, 3, 2, 1]

要求不能使用新数组,就用原来的数组
(自己写的)
 */
public class Demo11ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");

        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 - i > i) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
