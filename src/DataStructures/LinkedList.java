package DataStructures;

/**
 * Simple LinkedList implementation
 *
 * @param <T>
 *     type of data contained within the {@link LinkedList}.
 *
 * @author kevincoughlin
 */
public class LinkedList<T> {
    private Node head = null;

    public void add(T item) {
        final Node temp = new Node();
        temp.item = item;
        temp.next = head;
        head = temp;
    }

    public T remove() {
        final Node temp = head;
        head = temp.next;
        return (T) temp;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.item.toString() + " ");
            temp = temp.next;
        }
    }

    private static final class Node<T> {
        T item;
        Node next;
    }

    public static void main(String[] args) {
        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.remove();
        linkedList.print();
    }
}