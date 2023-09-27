package arrays.medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 1, 4};
        System.out.println(longestSuccessiveElements(arr));
    }

    public static int longestSuccessiveElements(int[] a) {
        int maxCount=1;
        HashSet<Integer> has=new HashSet<>();
        for (int ele:a){
            has.add(ele);
        }
        for (int ele:has){
            if(!has.contains(ele-1)){
                int x=ele+1, count=1;
                while (has.contains(x)){
                    count++;
                    x++;
                }
                maxCount=Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
