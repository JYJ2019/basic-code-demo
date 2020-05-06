package cn.itcast.day05.demo03;

public class Demo01Change {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);//1
        System.out.println(b);//2
        change( a, b);
        System.out.println(a);//1
        System.out.println(b);//2
    }

    public static void change( int a, int b){
        a = a + b;
        b = b + a;
    }
}
