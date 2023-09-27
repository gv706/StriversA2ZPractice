package arrays.hard;

import java.util.HashMap;

public class CountSubarraysWithGivenXorK {
    public static void main(String[] args) {
        int b = 2;
        int[] arr = {1, 2, 3, 2};
        System.out.println(subarraysWithSumK(arr, b));
    }

    public static int subarraysWithSumK(int[] a, int b) {
        int count = 0, xor = 0;
        HashMap<Integer, Integer> xorCounts = new HashMap<>();
        xorCounts.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
            if (xorCounts.containsKey(xor ^ b)) {
                count += xorCounts.get(xor ^ b);
            }
            xorCounts.put(xor, xorCounts.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
