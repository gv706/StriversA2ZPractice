package binary_search.one_d_arrays;

import java.util.ArrayList;

public class NumberOfOccurence {
    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1)
            return 0;
        return ans[1] - ans[0] + 1;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        //using lowerbound and upperbound
        int lb = lowerBound(arr, n, k);
        int ub = upperBound(arr, n, k);
        if (lb == n || arr[lb] != k)
            return new int[]{-1, -1};
        return new int[]{lb, ub - 1};
    }

    public static int upperBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
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
