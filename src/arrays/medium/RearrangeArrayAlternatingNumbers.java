package arrays.medium;

import java.util.Arrays;

public class RearrangeArrayAlternatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int[] ans = alternateNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] alternateNumbers(int[] a) {
        //If array contains equal number of +ves and -ves
        int[] ans = new int[a.length];
        int pi = 0, ni = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                ans[pi] = a[i];
                pi += 2;
            } else {
                ans[ni] = a[i];
                ni += 2;
            }
        }
        return ans;
    }
}
