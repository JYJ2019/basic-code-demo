package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
遍历集合
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("华莱士");
        list.add("肯德基");
        list.add("麦当劳");
        list.add("必胜客");

        System.out.println(list);//[华莱士, 肯德基, 麦当劳, 必胜客]

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
