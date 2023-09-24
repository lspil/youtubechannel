package org.example;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}