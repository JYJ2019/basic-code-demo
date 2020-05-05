package Day03;

//使用嵌套循环，打印5*8的矩形
public class Practice04 {
    public static void main(String[] args) {
        //5*8的矩形，打印5行*号，每行8个
        //外循环5次，内循环8次
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                //不换行打印星号
                System.out.print("*");
            }
            //内循环打印8个星号后，需要一次换行
            System.out.println();
        }
    }
}
