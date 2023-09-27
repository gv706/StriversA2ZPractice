package binary_search.one_d_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 2, 2, 2, 2));
        int k = 2;
        System.out.println(Arrays.toString(firstAndLastPosition(al, al.size(), k)));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        //using lowerbound and upperbound
        int lb = lowerBound(arr, n, k);
        int ub = upperBound(arr, n, k);
        if (lb == n || arr.get(lb) != k)
            return new int[]{-1, -1};
        return new int[]{lb, ub - 1};
    }

    public static int upperBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= x) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return low;
    }
}
