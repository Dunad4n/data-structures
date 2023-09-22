package org.example;

public class LinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public LinkedList() {}

    public LinkedList(T headValue) {
        this.head = new Node<>(headValue);
        tail = head;
        size++;
    }

    public int getSize() { return size; }
    public T getHead() { return head.getValue(); }
    public void setHead(T nodeValue) {
        head = new Node<>(nodeValue, head.getNext(), null);
        if (size == 0) {
            tail = head;
        }
        size++;
    }
    public T getTail() { return tail.getValue(); }
    public void setTail(T nodeValue) {
        tail = new Node<>(nodeValue, null, tail.getPrev());
        if (size == 0) {
            head = tail;;
        }
        size++;
    }

    public void add(T nodeValue) {
        Node<T> node;
        if (size == 0) {
            node = new Node<>(nodeValue, null, null);
            head = node;
        } else {
            node = new Node<T>(nodeValue, null, tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public T get(int index) {
        if (index == 0) {
            return head.getValue();
        }
        if (index == size - 1) {
            return tail.getValue();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    public void remove(int index) {
        if (index == 0) {
            if (size == 1) {
                head = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
        } else if (index == size - 1) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }

    public void set(int index, T nodeValue) {
        if (index == 0) {
            Node<T> node = new Node<T>(nodeValue);
            head.setPrev(node);
            node.setNext(head);
            head = node;
            size++;
            return;
        }
        if (index == size - 1) {
            add(nodeValue);
            return;
        }
        Node<T> node;
        if (index <= size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {
            node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.getPrev();
            }
        }
        Node<T> newNode = new Node<>(nodeValue, node.getNext(), node);
        node.getNext().setPrev(newNode);
        node.setNext(newNode);
        size++;
    }

}
