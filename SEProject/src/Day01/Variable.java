package Day01;

public class Variable {
    public static void main(String[] args) {
        //定义字节型变量
        byte b = 100;
        System.out.println(b);
        //定义短整型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i);
        //定义长整型变量
        long l = 123213213123213L;
        System.out.println(l);
        //定义单精度浮点数
        float f = 5.5F;
        System.out.println(f);
        //定义双精度浮点数
        double d = 3.12;
        System.out.println(d);
        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
        //定义字符型变量
        char c = 'A';
        System.out.println(c);

        /*
         long类型：建议数据后加L表示。
         ﬂoat类型：建议数据后加F表示。
         变量名称：在同一个大括号范围内，变量的名字不可以相同。
         变量赋值：定义的变量，不赋值不能使用。
         */
    }
}
