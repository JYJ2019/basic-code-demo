package cn.itcast.day10.demo01;

/*
接口就是一种公共的规范标准.只要符合规范标准,就可以大家通用.

在任何版本的Java中,接口都能定义抽象方法.
格式:
public abstract 返回值类型 方法名称(参数列表);

注意事项:
1.接口当中的抽象方法,修饰符必须是两个固定的关键字: public abstract
2.这两个关键字修饰符,可以选择性省略.(今天刚学,所以不推荐.)
3.方法的三要素,可以随意定义.
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void method1();

    //这也是一个抽象方法
    public void method2();

    //这也是一个抽象方法
    abstract void method3();

    //这也是一个抽象方法
    void method4();
}
