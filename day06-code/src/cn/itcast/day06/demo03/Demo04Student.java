package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("现在");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("我的姓名是:" + stu.getName() + ",\n我的年龄是:" + stu.getAge() + ",\n我的性别是:" + stu.isMale() + ".");
    }
}
