package sorts;

/**
 * Selection Sort implementation.
 *
 * @author kevincoughlin
 */
public final class Selection {

    public static void main(String[] args) {
        final Integer[] input = { 3, 7, 4, 9, 5, 2, 6, 1 };
        sort(input);
        assert isSorted(input);
        show(input);
    }

    public static void sort(final Comparable[] a) {
        final int N = a.length;
        if (N <= 1) return;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    private static boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void swap(final Comparable[] a, final int min, final int oldMin) {
        final Comparable old = a[oldMin];
        a[oldMin] = a[min];
        a[min] = old;
    }

    private static boolean isSorted(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }

    private static void show(final Comparable[] a) {
        for (final Comparable c : a) {
            System.out.print(c.toString());
        }
    }
}
