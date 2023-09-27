package arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 0, 1};
        System.out.println(getLongestZeroSumSubarrayLength(arr));
    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        //By using prefix sum subarray
        HashMap<Integer, Integer> has = new HashMap<>();
        int sum = 0, ans = 0;
        has.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (has.containsKey(sum)) {
                ans = Math.max(ans, i - has.get(sum));
            }
            has.put(sum, i);
        }
        return ans;
    }
}
