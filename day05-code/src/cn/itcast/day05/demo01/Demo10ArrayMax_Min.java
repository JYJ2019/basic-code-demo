package cn.itcast.day05.demo01;

/*
求出数组当中最大值和最小值
 */
public class Demo10ArrayMax_Min {
    public static void main(String[] args) {
        int[] array = {5, 20, 40, -90, 80, 3, 4, 667, -60};

        //求最大值max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大值是:" + max);

        //求最小值min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("最小值是:" + min);
    }
}
