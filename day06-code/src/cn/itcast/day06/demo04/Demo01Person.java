package cn.itcast.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "王经理";

        person.sayHello("先试试");
        System.out.println(person);
    }
}
