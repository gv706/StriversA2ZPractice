package arrays.medium;

import java.util.HashMap;

public class CountSubarraysWithSumK {
    public static void main(String[] args) {
        int n = 4, k = 6;
        int[] arr = {3, 1, 2, 4};
        System.out.println(subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {
//        int n = nums.length, ans = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int sum = 0;
//                for (int l = i; l <= j; l++) {
//                    sum += nums[l];
//                }
//                if (sum == k)
//                    ans++;
//            }
//        }
//        return ans;

        /*int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    ans += 1;
                    break;
                }
            }
        }
        return ans;*/

        int n = nums.length;
        HashMap<Integer, Integer> preSums = new HashMap<>();
        int sum = 0, ans = 0;
        preSums.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (preSums.containsKey(sum - k)) {
                ans += preSums.get(sum - k);
            }
            preSums.put(sum, preSums.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
