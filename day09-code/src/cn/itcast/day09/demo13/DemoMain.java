package cn.itcast.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();//错误
//        Dog dog = new Dog();//错误,这也是抽象类

        DogGolden dogGolden = new DogGolden();//这是普通类,可以直接new对象.
        dogGolden.eat();
        dogGolden.sleep();
        System.out.println("====================");

        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
    }
}
