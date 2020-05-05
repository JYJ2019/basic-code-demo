package Day02;

import java.util.Base64;

//常量和变量的运算
public class ConstantVariable {

    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = 1 + 2;
        //byte b4 = b1 + b2;会报错,
        System.out.println(b3);
        //System.out.println(b4);
    }
    /*
    分析： b3 = 1 + 2 ， 1 和 2 是常量，为固定不变的数据，在编译的时候（编译器javac），
    已经确定了 1+2 的结果并没 有超过byte类型的取值范围，可以赋值给变量 b3 ，因此 b3=1 + 2 是正确的。
    反之， b4 = b2 + b3 ， b2 和 b3 是变量，变量的值是可能变化的，在编译的时候，
    编译器javac不确定b2+b3的结果是什么，因此会将结果以int类型进行处理，所以int类型不能赋值给byte类型，
    因此编译失败。
     */
}
