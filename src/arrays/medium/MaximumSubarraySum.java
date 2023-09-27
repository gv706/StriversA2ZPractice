package arrays.medium;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    public static long maxSubarraySum(int[] arr, int n) {
        //By using divide and conquer approach
        return Math.max(0, divideAndConquer(arr, 0, n - 1));
    }

    static long divideAndConquer(int[] arr, int l, int r) {
        if (l == r)
            return arr[l];
        if (r < l)
            return Integer.MIN_VALUE;
        int m = (l + r) / 2;
        long leftSum = divideAndConquer(arr, l, m);
        long rightSum = divideAndConquer(arr, m + 1, r);
        long crossingSum = maxCrossingSum(arr, l, m, r);
        return Math.max(crossingSum, Math.max(leftSum, rightSum));
    }

    static long maxCrossingSum(int[] arr, int l, int m, int r) {
        long sum = 0, leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }
        sum = 0;
        for (int i = m; i <= r; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }
        return Math.max(leftSum + rightSum - arr[m], Math.max(leftSum, rightSum));
    }
}
