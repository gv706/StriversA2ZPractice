package arrays.hard;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {-1, 3, 0, -4, 3};
        System.out.println(subarrayWithMaxProduct(arr));
    }

    public static int subarrayWithMaxProduct(int[] arr) {
        int ans = Integer.MIN_VALUE, pre = 1, suf = 1, n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            pre = pre * arr[i];
            suf = suf * arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suf));
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
        }
        return ans;
    }
}
