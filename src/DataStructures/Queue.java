package DataStructures;

public class Queue<T> {
    private int size;
    private Node first;
    private Node last;

    public void enqueue() {

    }

    public T dequeue() {
        return null;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private static final class Node<T> {
        T item;
        Node next;
    }
}
