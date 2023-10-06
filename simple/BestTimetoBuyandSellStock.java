package simple;

public class BestTimetoBuyandSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int startTrade = Integer.MAX_VALUE;
            int finalProfit = 0;
            int price = 0;

            for(int i = 0; i < prices.length; i++){
                if(prices[i] < startTrade){
                    startTrade = prices[i];
                }
                price = prices[i] - startTrade;
                if(finalProfit < price){
                    finalProfit = price;
                }
            }
            return finalProfit;
        }
    }
}
