package DataStructures;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Simple Stack implementation
 *
 * @param <T>
 *     type of data contained within the {@link Stack}.
 *
 * @author kevincoughlin
 */
public class Bag<T> implements Iterable<T> {
    private Node head;
    private int size;

    public void push(T item) {
        final Node temp = new Node();
        temp.item = item;
        temp.next = head;
        head = temp;
        this.size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public T next() {
            final T item = (T) this.current.item;
            this.current = this.current.next;
            return item;
        }
    }

    private class Node {
        T item;
        Node next;
    }

    public static void main(String[] args) {
        final Bag<String> s = new Bag<>();
        s.push("a");
        s.push("b");
        s.push("c");
        for (final String item : s) {
            System.out.print(item + " ");
        }
    }
}
