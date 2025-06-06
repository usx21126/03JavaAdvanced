package com.xh.d5_list;

import java.util.StringJoiner;

public class MyLinkedList<E> {

    private int size = 0;
    private MyLinkedList.Node<E> head; //头指针
    public static class Node<E> {
        public E element;
        public Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
    public void add(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        this.size++;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",","[","]");
        Node<E> temp = head;
        while(temp != null) {
            sj.add(String.valueOf(temp.element));
            temp = temp.next;
        }
        return sj.toString();
    }

    public int size() {
        return size;
    }

}
