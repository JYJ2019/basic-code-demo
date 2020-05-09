package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("伦理学");
        stu1.setAge(13);
        System.out.println("我是:" + stu1.getName() + ",年龄:" + stu1.getAge());

        System.out.println("================");

        Student stu2 = new Student("斯蒂芬",19);
        System.out.println("我是:" + stu2.getName() + ",年龄:" + stu2.getAge());
        stu2.setAge(22);
        System.out.println("我是:" + stu2.getName() + ",年龄:" + stu2.getAge());
    }

}
