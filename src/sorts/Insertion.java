package sorts;


/**
 * Selection Sort implementation.
 *
 * @author kevincoughlin
 */
public final class Insertion {

    public static void main(String[] args) {
        final Integer[] input = { 3, 7, 4, 9, 5, 2, 6, 1 };
        sort(input);
        assert isSorted(input);
        show(input);
    }

    public static void sort(final Comparable[] a) {
        final int N = a.length;
        if (N <= 1) return;
        for (int i = 1; i < N; i++) {
            final Comparable item = a[i];
            int j = i - 1;
            while (j > -1 && less(item, a[j])) {
                swap(j + 1, j, a);
                j--;
            }
            a[j + 1] = item;
        }
    }

    private static boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void swap(final int oldMin, final int min, final Comparable[] a) {
        a[oldMin] = a[min];
    }

    private static void show(final Comparable[] a) {
        for (final Comparable c : a) {
            System.out.print(c.toString());
        }
    }

    private static boolean isSorted(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }
}
