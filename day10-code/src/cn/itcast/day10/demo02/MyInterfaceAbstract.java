package cn.itcast.day10.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodB() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }
}
