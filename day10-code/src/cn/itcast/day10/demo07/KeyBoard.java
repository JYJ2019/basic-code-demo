package cn.itcast.day10.demo07;

/*
键盘类,要实现USB接口,具备敲击的方法
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启,绿灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭,绿灯熄灭");
    }

    public void type() {
        System.out.println("键盘打字");
    }
}
