package org.example;

import org.example.BinarySearchTree.BinarySearchTree;
import org.example.BinarySearchTree.Node;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(15);
        tree.add(8);
        tree.add(5);
        tree.add(14);
        tree.add(11);
        tree.add(12);
        tree.add(13);
        tree.add(100);
        tree.add(50);
        tree.add(22);

        tree.remove(8);

        Node node22 = tree.get(22);
        Node node5 = tree.get(5);
        Node node9 = tree.get(9);
        Node nullNode = tree.get(6);
    }
}