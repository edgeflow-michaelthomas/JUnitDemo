package de.schulung.mylist;


public class MyLinkedList<T> {
    private MyNode<T> head = null;
    private int size = 0;

    public void add(T data) {
        if (head == null) {
            head = new MyNode<T>(data);
        } else {
            MyNode<T> current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            MyNode<T> newNode = new MyNode<T>(data);
            current.setNext(newNode);
            newNode.setPrev(current);
        }

        size++;
    }

    public T remove(int index) {
        if ( index >= size || index < 0){
            return null;
        }

        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        T data = current.getData();

        MyNode<T> prev = current.getPrev();
        MyNode<T> next = current.getNext();

        if (prev != null) {
            prev.setNext(next);
        }

        if (next != null) {
            next.setPrev(prev);
            if (prev == null) {
                head = next;
            }
        }
        size--;

        return data;
    }

    public T get(int index) {
        MyNode<T> current = head;

        if ( index >= size || index < 0){
            return null;
        }

        for (int i = 0; i < index; i++) {

            current = current.getNext();
        }

        return current.getData();
    }

    public int size() {
        return size;
    }
}
