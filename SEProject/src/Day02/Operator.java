package Day02;

//调用练习
public class Operator {
    public static void main(String[] args) {
        //调用定义的方法operator
        operator();
    }

    //定义方法，方法中定义三元运算符
    public static void operator(){
        int i = 0;
        i = (i == 2 ? 100 : 200);
        System.out.println(i);

        int j = 0;
        j = (3 <= 4 ? 500 : 600);
        System.out.println(j);
    }
}
