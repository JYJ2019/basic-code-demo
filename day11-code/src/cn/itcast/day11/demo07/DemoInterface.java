package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

//        for (String s : result) {
//            System.out.println(s);
//        }
    }

    public static List<String> addName(List<String> list) {
        list.add("工时费");
        list.add("双方都");
        list.add("是非得失");
        list.add("萨达");

        return list;
    }
}

