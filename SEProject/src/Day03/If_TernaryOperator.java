package Day03;

//if语句和三元运算符的互换
public class If_TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //定义变量,保存a 和 b的较大值
        int c;
        if (a > b){
            c = a;
        }else {
            c = b;
        }

        //可以将上述功能改写为三元运算符形式
        c = a > b ? a : b;

    }
}
