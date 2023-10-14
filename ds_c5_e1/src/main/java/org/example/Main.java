package org.example;

public class Main {
    public static void main(String[] args) {
        CustomBinaryTree binaryTree = new CustomBinaryTree();

        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);

        System.out.println(binaryTree.contains(6));
        System.out.println(binaryTree.contains(1));
    }
}