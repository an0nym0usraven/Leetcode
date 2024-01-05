class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        int[] profitBefore = new int[N];
        int[] profitAfter = new int[N];

        int minBuy = prices[0];
        for(int i = 1; i < N; i++) 
        {
            profitBefore[i] = Math.max(profitBefore[i-1], prices[i] - minBuy);
            minBuy = Math.min(minBuy, prices[i]);
        }

        int maxSell = prices[N - 1];
        for (int i = N - 2; i >= 0; i--) 
        {
            profitAfter[i] = Math.max(profitAfter[i+1], maxSell - prices[i]);
            maxSell = Math.max(maxSell, prices[i]);
        }

        int result = 0;
        for(int i = 0; i < N; i++) 
        {
            result = Math.max(result, profitBefore[i] + profitAfter[i]);
        }
        return result;
    }
}