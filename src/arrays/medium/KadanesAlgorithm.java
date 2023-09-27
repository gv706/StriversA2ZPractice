package arrays.medium;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    public static long maxSubarraySum(int[] arr, int n) {
        long max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0)
                sum = 0;
            max = Math.max(sum, max);
        }
        return Math.max(max, 0);
    }
}
