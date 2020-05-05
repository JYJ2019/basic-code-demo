package Day03;

/*
x和y的关系满足如下:
如果 x >= 3,那么y = 2x + 1;
如果 -1 < x < 3,那么y = 2x;
如果 x <= -1.那么 y = 2x - 1;
根据给定的x的值,计算出y的值并输出
 */
public class IfElseExt {
    public static void main(String[] args) {
        //定义变量
        int x = 5;
        int y;
        if (x >= 3){
            y = 2 * x + 1;
        }
        else if (x > -1 && x < 3)
        {
            y = 2 * x;
        }
        else
        {
            y = 2 * x - 1;
        }
        System.out.println("y的值为:" + y);
    }
}
