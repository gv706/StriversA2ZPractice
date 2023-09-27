package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> sa = Arrays.asList(1, 2, 3);
        System.out.println(Arrays.toString(sa.toArray()));
        System.out.println(Arrays.deepToString(pascalTriangle(n)));
    }

    public static int[][] pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int mul = 1;
            List<Integer> temp = new ArrayList<>();
            temp.add(mul);
            for (int j = 1; j < i; j++) {
                mul = mul * (i - j) / j;
                temp.add(mul);
            }
            ans.add(temp);
        }
        return ans.stream()
                .map(li -> li.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }
}
