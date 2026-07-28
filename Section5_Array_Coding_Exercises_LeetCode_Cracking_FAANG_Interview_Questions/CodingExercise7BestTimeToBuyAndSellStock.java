/*
    Best Time to Buy and Sell Stock - LeetCode 121
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock
    and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.

    Example:

    Input: prices = [7, 1, 5, 3, 6, 4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
*/
public class CodingExercise7BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else if (price - minPrice > max) {
                max = price - minPrice;
            }
        }

        return max;
    }

    /* Solution 2
    public static int maxProfit(int[] prices) {
        int max = 0;

        for (int i=0; i<prices.length; i++) {
            for (int j=i+1; j<prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > 0 && profit > max) max = profit;
            }
        }

        return max;
    }

     */
}
