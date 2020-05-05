package Day03;

/*
语句练习
指定考试成绩，判断学生等级
90-100      优秀
80-89       好
70-79       良
60-69       及格
60以下       不及格
 */
public class Practice01 {

    public static void main(String[] args) {
        int score = 100;
        if(score < 0 || score > 100){
            System.out.println("你的成绩是错误的!");
        }else if(score >= 90 && score <= 100){
            System.out.println("优秀");
        }else if(score >= 80 && score < 90){
            System.out.println("好");
        }else if(score >= 70 && score < 80){
            System.out.println("良");
        }else if(score >= 60 && score < 70){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
