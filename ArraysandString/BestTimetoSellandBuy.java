class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<prices.length; i++){
            int ppf = prices[i]-min; // possible profit
            if(ppf>profit)  profit=ppf;
            if(prices[i]<min){
                min = prices[i];
            }
        }

        return profit;
    }
}
