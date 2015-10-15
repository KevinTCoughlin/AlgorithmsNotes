package sorts;

/**
 * Selection Sort implementation.
 *
 * @author kevincoughlin
 */
public final class Selection {

    public static void main(String[] args) {
        final String[] input = "SORTEDEXAMPLE".split("");
        final Comparable[] sorted = sort(input);
        assert isSorted(sorted);
        show(sorted);
    }

    public static Comparable[] sort(final Comparable[] a) {
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
        return a;
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
