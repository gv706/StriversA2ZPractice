package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpriralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] ans = spiralMatrix(mat);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        int[] ans1 = method1(mat);
        System.out.println();
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }
    }

    public static int[] method1(int[][] mat) {
        int left = 0, top = 0, down = mat.length - 1, right = mat[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        while (left <= right && top <= down) {
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= down; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            if (top < down) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[down][i]);
                }
                down--;
            }
            if (left < right) {
                for (int i = down; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static int[] spiralMatrix(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int left = 0, right = mat[0].length - 1, top = 0, down = mat.length - 1;
        int dir = 0;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    ans.add(mat[top][i]);
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    ans.add(mat[i][right]);
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[down][i]);
                }
                down--;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
