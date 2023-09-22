package org.example;

public class Queue<T> {

    private LinkedList<T> list = new LinkedList<>();

    public Queue() {}

    public int getSize() {
        return list.getSize();
    }

    public void add(T nodeValue) {
        list.add(nodeValue);
    }

    public T poll() {
        if (list.getSize() == 0) {
            return null;
        }
        T value = list.getHead();
        list.remove(0);
        return value;
    }

    public T peek() {
        if (list.getSize() == 0) {
            return null;
        }
        return list.getHead();
    }

}
