package binary_search.one_d_arrays;

import java.util.ArrayList;

public class SearchInARotatedSortedArrayII {

    public static boolean searchInARotatedSortedArrayII(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return true;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = mid + 1;
                high = mid - 1;
            } else if (arr[low] <= arr[mid]) {
                if (arr[low] <= key && key <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] <= key && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}
