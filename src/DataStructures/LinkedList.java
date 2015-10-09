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

    @Override
    public String toString() {
        String str = "[";
        Node temp = head;
        while (temp != null) {
            final String endStr = temp.next != null ? ", " : "";
            str += temp.item.toString() + endStr;
            temp = temp.next;
        }
        str += "]";
        return str;
    }

    private class Node {
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
        System.out.print(linkedList.toString());

        final java.util.LinkedList<String> list = new java.util.LinkedList<>();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.addFirst("f");
        list.remove();
        System.out.print(list.toString());
    }
}