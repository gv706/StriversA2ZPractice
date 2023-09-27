package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(superiorElements(arr));
    }

    public static List<Integer> superiorElements(int[] a) {
        int maxRight = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > maxRight)
                ans.add(a[i]);
            maxRight = Math.max(maxRight, a[i]);
        }
        return ans;
    }
}
