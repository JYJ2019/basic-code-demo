package cn.itcast.day08.demo04;

/*
题目:计算在-10.8到5.9之间,绝对值大于6或者小于2.1的整数有多少个?
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double ceil = Math.ceil(-10.8);
        double floor = Math.floor(5.9);
        int count = 0;
        for (int i = (int) ceil; i < floor; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("整数有:" + count + "个");
    }
}
