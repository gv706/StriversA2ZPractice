package arrays.medium;

import java.util.Arrays;

public class SortAnArray0s1s2s {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        //By using dutch national flag algorithm
        int l = 0, m = 0, r = arr.length - 1;
        while (m <= r) {
            if (arr[m] == 0) {
                swap(arr, l, m);
                l++;
                m++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                swap(arr, r, m);
                r--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
