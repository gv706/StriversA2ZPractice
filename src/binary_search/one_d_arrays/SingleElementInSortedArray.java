package binary_search.one_d_arrays;

import java.util.ArrayList;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 1)
            return arr.get(0);
        if (!arr.get(0).equals(arr.get(1)))
            return arr.get(0);
        if (!arr.get(n - 1).equals(arr.get(n - 2)))
            return arr.get(n - 1);

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (!arr.get(mid - 1).equals(arr.get(mid)) &&
                    !arr.get(mid).equals(arr.get(mid + 1))) {
                return arr.get(mid);
            }
            if (((mid & 1) == 0 && arr.get(mid).equals(arr.get(mid + 1))) ||
                    ((mid & 1) != 0 && arr.get(mid).equals(arr.get(mid - 1))))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
