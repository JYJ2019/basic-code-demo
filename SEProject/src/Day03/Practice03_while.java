package Day03;

//while循环计算1-100之间的和
public class Practice03_while {
    public static void main(String[] args) {
        //使用while循环实现
        //定义一个变量,记录累加求和
        int sum = 0;
        //定义初始化表达式
        int i = 1;
        //使用while循环让初始化表达式的值变化
        while (i <= 100){
            //累加求和
            sum += i;
            //步进表达式改变变量的值
            i++;
        }
        //打印求和的变量
        System.out.println(sum);
    }
}
