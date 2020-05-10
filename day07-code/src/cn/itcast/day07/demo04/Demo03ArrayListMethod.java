package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有:

public boolean add(E e);向集合当中添加元素,参数的类型和泛型一致.返回值代表添加是否成功.
备注:对于ArrayList集合来说,add添加动作一定是成功的,所以返回值可用可不用.
但是对于其他集合(今后学习)来说,add添加动作不一定成功.

public E get(int index):从集合当中获取元素,参数是索引编号,返回值就是对应位置的元素.

public E remove(int index):从集合当中删除元素,参数是索引编号,返回值就是被删除掉的元素.

public int size():获取集合的尺寸长度,返回值是集合中包含的元素个数.
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);//[]

//      从集合中添加元素:add
        boolean kfc = list.add("肯德基");
        System.out.println(list);
        System.out.println("add添加的动作是否成功:" + kfc);//true

        list.add("麦当劳");
        list.add("华莱士");
        list.add("必胜客");

//      从集合中获取元素:get.索引值从0 开始

        System.out.println(list);//[肯德基, 麦当劳, 华莱士, 必胜客]
        String hls = list.get(2);
        System.out.println("获取到的是:" + hls);//华莱士

//      从集合中删除元素:remove.索引值从0 开始
        String remove = list.remove(1);//麦当劳
        System.out.println("被删除的是:" + remove);
        System.out.println(list);//[肯德基, 华莱士, 必胜客]

//      获取集合的长度尺寸,也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是:" + size);//3
    }
}
