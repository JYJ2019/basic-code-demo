package Day03;

//循环练习：使用循环，计算1-100之间的偶数和
public class Practice02 {
    public static void main(String[] args) {
        //1.定义一个初始化变量,记录累加求和,初始值为0
        int sum = 0;
        //2.利用for循环获取1‐100之间的数字
        for (int i = 1; i <= 100 ; i++) {
            //3.判断获取的数是奇数还是偶数
            if (i % 2 == 0){
                //4.如果是偶数就累加求和
                sum += i;
            }
        }
        //5.循环结束之后,打印累加结果
        System.out.println(sum);//2550
    }
}
