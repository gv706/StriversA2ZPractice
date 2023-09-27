package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(7, 1, 5, 3, 6, 4));
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(ArrayList<Integer> prices) {
        // Write your code here.
        int maxProfit = 0, cost = prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            maxProfit = Math.max(maxProfit, prices.get(i) - cost);
            cost = Math.min(cost, prices.get(i));
        }
        return maxProfit;
    }
}
