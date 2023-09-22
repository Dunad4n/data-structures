package org.example;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public Stack() {}

    public int getSize() {
        return list.getSize();
    }

    public void push(T nodeValue) {
        list.add(nodeValue);
    }

    public T pop() {
        if (list.getSize() == 0) {
            return null;
        }
        T value = list.getTail();
        list.remove(list.getSize() - 1);
        return value;
    }

    public T peek() {
        return list.getTail();
    }

}
