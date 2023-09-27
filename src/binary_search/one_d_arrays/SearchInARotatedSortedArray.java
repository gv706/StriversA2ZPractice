package binary_search.one_d_arrays;

import java.util.ArrayList;

public class SearchInARotatedSortedArray {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int m = (low + high) / 2;
            if (arr.get(m) == k)
                return m;
            else if (arr.get(low) <= arr.get(m)) {
                if (arr.get(low) <= k && k <= arr.get(m))
                    high = m - 1;
                else
                    low = m + 1;
            } else {
                if (arr.get(m) <= k && k <= arr.get(high))
                    low = m + 1;
                else
                    high = m - 1;
            }
        }
        return -1;
    }
}
