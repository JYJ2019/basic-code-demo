package Day02;

//+=符号的扩展
public class CodeExamples {
    public static void main(String[] args) {
        short s = 1;
        s += 1;
        System.out.println(s);
    }
    /*
    分析： s += 1 逻辑上看作是 s = s + 1 计算结果被提升为int类型，
    再向short类型赋值时发生错误，因为不能将取值范围大的类型赋值到取值范围小的类型。
    但是， s=s+1进行两次运算 ， += 是一个运算符，(只运算一次)，并带有(强制转换)的特点，
    也就是说 s += 1 就是 s = (short)(s + 1) ，因此程序没有问题编译通过，运行结果是2.
     */
}
