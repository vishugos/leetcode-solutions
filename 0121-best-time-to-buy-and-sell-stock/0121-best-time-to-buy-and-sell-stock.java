class Solution {
    public int maxProfit(int[] prices) {

        int minprices = Integer.MAX_VALUE;

        int maxprices = 0;

        for(int i = 0 ; i < prices.length ;  i++ ){

            // find the min value 

            minprices = Math.min(minprices , prices[i]);

            // find the maxprices value

            maxprices = Math.max(maxprices , prices[i] - minprices);
        }

        return maxprices;
        
    }
}