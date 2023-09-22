package org.example.BinarySearchTree;

public class BinarySearchTree {

    private Node root = null;

    public BinarySearchTree() {}

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        addNode(root, value);
    }

    public void remove(int value) {
        if (root.getValue() == value) {
            root = null;
            return;
        }
        removeNode(root, value);
    }

    public Node get(int value) {
        return getNode(root, value);
    }

    private Node getNode(Node root, int value) {
        if (root.getValue() == value) {
            return root;
        } else if (value < root.getValue() && root.getLeft() != null) {
            return getNode(root.getLeft(), value);
        } else if (value > root.getValue() && root.getRight() != null) {
            return getNode(root.getRight(), value);
        }
        return null;
    }

    private void removeNode(Node root, int value) {
        if (root.getValue() == value) {                                             // find node with value
            boolean isLeftChild = root.getParent().getLeft() == root;
            if (root.getLeft() != null && root.getRight() != null) {                // if node has two children
                Node leastElementOfRightTree;
                Node parent = root.getParent();

                if (root.getRight().getLeft() != null) {
                    leastElementOfRightTree = findLeastNode(root.getRight());

                    if (leastElementOfRightTree.getRight() != null) {
                        leastElementOfRightTree.getRight().setParent(leastElementOfRightTree.getParent());
                        leastElementOfRightTree.getParent().setLeft(leastElementOfRightTree.getRight());
                        leastElementOfRightTree.setRight(root.getRight());
                        root.getRight().setParent(leastElementOfRightTree);
                    }

                } else {
                    leastElementOfRightTree = root.getRight();
                    leastElementOfRightTree.setParent(parent);
                }

                leastElementOfRightTree.setParent(parent);
                leastElementOfRightTree.setLeft(root.getLeft());
                root.getLeft().setParent(leastElementOfRightTree);

                if (isLeftChild) {
                    parent.setLeft(leastElementOfRightTree);
                } else {
                    parent.setRight(leastElementOfRightTree);
                }

            } else if (root.getLeft() != null) {            // if node has only left child
                Node leftTree = root.getLeft();
                if (isLeftChild) {
                    root.getParent().setLeft(leftTree);
                } else {
                    root.getParent().setRight(leftTree);
                }
                leftTree.setParent(root.getParent());
            } else if (root.getRight() != null) {          // if node has only right child
                Node rightTree = root.getRight();
                if (isLeftChild) {
                    root.getParent().setLeft(rightTree);
                } else {
                    root.getParent().setRight(rightTree);
                }
                rightTree.setParent(root.getParent());
            } else {                                        // if node has no children
                if (isLeftChild) {
                    root.getParent().setLeft(null);
                } else {
                    root.getParent().setRight(null);
                }
            }
        } else if (value < root.getValue()) {
            if (root.getLeft() != null) {                   // recursive find node
                removeNode(root.getLeft(), value);
            }
        } else {
            if (root.getRight() != null) {                  // recursive find node
                removeNode(root.getRight(), value);
            }
        }
    }

    private void addNode(Node root, int value) {
        if (value < root.getValue()) {
            if (root.getLeft() != null) {
                addNode(root.getLeft(), value);
            } else {
                root.setLeft(new Node(value, root));
            }
        } else if (value > root.getValue()) {
            if (root.getRight() != null) {
                addNode(root.getRight(), value);
            } else {
                root.setRight(new Node(value, root));
            }
        }
    }

    private Node findLeastNode(Node root) {
        if (root.getLeft() != null) {
            return findLeastNode(root.getLeft());
        }
        return root;
    }

}
