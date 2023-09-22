package org.example;

public class Node<T> {

    private T value;
    private Node<T> next = null;
    private Node<T> prev = null;

    public Node() {}

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next, Node<T> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }
    public Node<T> getNext() { return next; }
    public void setNext(Node<T> next) { this.next = next; }
    public Node<T> getPrev() { return prev; }
    public void setPrev(Node<T> prev) { this.prev = prev; }


}
