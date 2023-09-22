package org.example.BinarySearchTree;

public class Node {
    private int value;
    private Node left = null;
    private Node right = null;
    private Node parent = null;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public Node(int value, Node left, Node right, Node parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
