public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(int value) {
        this.root = new Node(value);
    }

    public void add(int value) {
        this.root = add(root, value);
    }

    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        }

        return current;
    }

    public void parse() {
        parse(root);
    }

    private void parse(Node current) {
        if (current == null) {
            return;
        }

        parse(current.left);
        System.out.println(current.value);
        parse(current.right);
    }

    private static class Node {

        private int value;
        private Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }
}
