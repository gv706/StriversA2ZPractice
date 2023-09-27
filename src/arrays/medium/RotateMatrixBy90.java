package arrays.medium;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }

    public static void rotate(int[][] mat) {
        //Rotate the matrix by 90
        //can be done by transposing the matrix and reversing each subarray
        int m = mat.length, n = mat[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }
        for (int i = 0; i < m; i++) {
            reverse(mat[i], 0, mat[i].length - 1);
        }
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
