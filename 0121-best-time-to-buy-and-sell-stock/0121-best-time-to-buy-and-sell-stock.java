class Solution {
    public int maxProfit(int[] prices) {
        int[] aux = new int[prices.length];
        aux[prices.length - 1] = prices[prices.length - 1];
        for(int i = prices.length-2; i>=0; i--)
        {
            aux[i] = prices[i] > aux[i+1] ? prices[i] : aux[i+1];
        }
        System.out.println(Arrays.toString(aux));
        int profit = 0;

        for(int j=0; j<prices.length; j++)
        {
            if(aux[j] - prices[j] > profit)
            {
                profit = aux[j] - prices[j];
            }
        }
        return profit;
    }
}