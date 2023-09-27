package binary_search.one_d_arrays;

public class LowerBound {
    public static int lowerBound1(int[] arr, int n, int x) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                high = mid - 1;
                ans = mid;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }
}
