package arrays.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] nums) {
        //finding the breakpoint
        int bp = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bp = i;
                break;
            }
        }
        if (bp != -1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[bp]) {
                    swap(nums, bp, i);
                    break;
                }
            }
        }
        reverse(nums, bp + 1, nums.length - 1);
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
