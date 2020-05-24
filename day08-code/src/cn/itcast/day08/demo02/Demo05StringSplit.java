package cn.itcast.day08.demo02;

/*
分割字符串的方法:
public String[] split(String regex):按照参数的规则,将字符串切分成为若干部分.

注意事项:
split方法的参数其实是一个"正则表达式",今后学习.
今天要注意,如果按照英文句点"."进行切分,必须写"\\."(两个反斜杠)
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "A,B,C";
        String[] splitArray = str1.split(",");
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);
        }
        System.out.println("=============================");

        String str2 = "A B C";
        String[] splitArray2 = str2.split(" ");
        for (int i = 0; i < splitArray2.length; i++) {
            System.out.println(splitArray2[i]);
        }
        System.out.println("=============================");

        String str3 = "A.B.C";
//        String[] splitArray3 = str3.split(".");错误写法
        String[] splitArray3 = str3.split("\\.");
        System.out.println(splitArray3.length);
        for (int i = 0; i < splitArray3.length; i++) {
            System.out.println(splitArray3[i]);
        }


    }

}
