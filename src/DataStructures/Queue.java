package DataStructures;

public class Queue<T> {
    private int size;
    private Node first;
    private Node last;

    public void enqueue(T item) {
        final Node old = this.last;
        this.last = new Node();
        this.last.item = item;
        this.last.next = null;
        if (isEmpty()) {
            this.first = this.last;
        } else {
            old.next = this.last;
        }
        this.size++;
    }

    public T dequeue() {
        final Node temp = this.first;
        this.first = this.first.next;
        this.size--;
        return (T) temp;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public String toString() {
        String s = "";
        for (Node item = this.first; item != null; item = item.next) {
            s += item.item.toString() + " ";
        }
        return s;
    }

    private static final class Node<T> {
        T item;
        Node next;
    }

    public static void main(String[] args) {
        final Queue<String> s = new Queue<>();
        s.enqueue("a");
        s.enqueue("b");
        s.enqueue("c");
        s.dequeue();
        s.dequeue();
        System.out.println(s.toString());
    }
}
