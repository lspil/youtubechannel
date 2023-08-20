package org.example;

public class LList {

    private Node first;

    public void add(int value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public int get(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next;
        }

        return current.getValue();
    }

    public void set(int index, int value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next;
        }

        current.setValue(value);
    }

    public void remove(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) {
            first = first.next;
            return;
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next;
        }

        current.next = current.next.next;
    }

    public void insert(int index, int value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = first;
            first = newNode;
            return;
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.next;
        }

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
