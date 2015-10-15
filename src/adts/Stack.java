package adts;

/**
 * Simple Stack implementation
 *
 * @param <T>
 *     type of data contained within the {@link Stack}.
 *
 * @author kevincoughlin
 */
public class Stack<T> {
    private int size;
    private Node first;

    public void push(T item) {
        final Node temp = new Node();
        temp.item = item;
        temp.next = this.first;
        this.first = temp;
        this.size++;
    }

    public T pop() {
        final Node oldTemp = this.first;
        this.first = oldTemp.next;
        this.size--;
        return (T) oldTemp;
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

    private class Node {
        T item;
        Node next;
    }

    public static void main(String[] args) {
        final Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.pop();
        s.pop();
        System.out.println(s.toString());
    }
}
