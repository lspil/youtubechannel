package org.example;

public class DoubleLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public void addLast(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }

        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }

        size++;
    }

    public int get(int index) {
        if (index >= size && index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getValue();
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException();
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node second = head.getNext();
            second.setPrev(null);
            head = second;
        }

        size--;
    }

    public int getFirst() {
        if (head == null) {
            throw new IllegalStateException();
        }

        return head.getValue();
    }


    public int size() {
        return size;
    }

    private static class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
