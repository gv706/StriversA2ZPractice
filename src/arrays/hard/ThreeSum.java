package arrays.hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] ar = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = triplet(ar.length, ar);
        System.out.println(ans);

        List<List<Integer>> ans1 = method1(ar.length, ar);
        System.out.println(ans1);

        List<List<Integer>> ans2 = method2(ar.length, ar);
        System.out.println(ans1);
    }

    public static List<List<Integer>> triplet(int n, int[] arr) {
        //By using two pointers approach
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int k = n - 1; k >= 2; k--) {
            if (k == n - 1 || arr[k] != arr[k + 1]) {
                int l = 0, r = k - 1;
                while (l < r) {
                    if (arr[l] + arr[r] + arr[k] == 0) {
                        ans.add(new ArrayList<>(Arrays.asList(arr[l], arr[r], arr[k])));
                        while (l < r && arr[l] == arr[l + 1]) l++;
                        while (l < r && arr[r] == arr[r - 1]) r--;
                        l++;
                        r--;
                    } else if (arr[l] + arr[r] + arr[k] > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        ans.sort(Comparator.comparingInt(e -> e.get(0)));
        return ans;
    }

    static List<List<Integer>> method2(int n, int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (temp.contains(third)) {
                    List<Integer> li = Arrays.asList(arr[i], arr[j], third);
                    li.sort(null);
                    ans.add(li);
                }
                temp.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    static List<List<Integer>> method1(int n, int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> li = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(li);
                        ans.add(li);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
