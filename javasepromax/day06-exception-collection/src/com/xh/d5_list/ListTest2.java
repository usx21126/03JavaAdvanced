package com.xh.d5_list;

import java.util.LinkedList;

public class ListTest2 {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();
        queue.add("第1个人");
        queue.add("第2个人");
        queue.add("第3个人");
        queue.add("第4个人");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("第1");
        stack.addFirst("第2");
        stack.addFirst("第3");
        stack.addFirst("第4");
        stack.addFirst("第5");
        System.out.println(stack);

        //出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
class Test{
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        System.out.println(list);
        System.out.println(list.size());
    }
}