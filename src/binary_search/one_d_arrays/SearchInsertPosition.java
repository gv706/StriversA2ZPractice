package binary_search.one_d_arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int x) {
        //By using lower bound
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
