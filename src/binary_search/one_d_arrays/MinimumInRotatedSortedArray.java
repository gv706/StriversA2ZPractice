package binary_search.one_d_arrays;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1, ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
