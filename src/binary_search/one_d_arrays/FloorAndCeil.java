package binary_search.one_d_arrays;

import java.util.Arrays;

public class FloorAndCeil {
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int floor, ceil, low = 0, high = n - 1;
        while (low <= high) {
            int m = (low + high) / 2;
            if (arr[m] >= x)
                high = m - 1;
            else
                low = m + 1;
        }
        ceil = low != n ? arr[low] : -1;

        low = 0;
        high = n - 1;
        while (low <= high) {
            int m = (low + high) / 2;
            if (arr[m] <= x)
                low = m + 1;
            else
                high = m - 1;
        }
        floor = high != -1 ? arr[high] : -1;

        System.out.print(floor + " ");
        return ceil;
    }
}
