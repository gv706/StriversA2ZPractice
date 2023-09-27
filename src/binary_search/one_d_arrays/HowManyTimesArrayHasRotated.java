package binary_search.one_d_arrays;

public class HowManyTimesArrayHasRotated {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1, ans = Integer.MAX_VALUE, minInd = -1;
        while (low <= high) {
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    minInd = low;
                }
                break;
            }
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    minInd = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    minInd = mid;
                }
                high = mid - 1;
            }
        }
        return minInd;
    }
}
