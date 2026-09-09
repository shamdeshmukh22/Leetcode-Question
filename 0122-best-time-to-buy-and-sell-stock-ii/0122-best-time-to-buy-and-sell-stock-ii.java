class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=0;
        for(int i:prices){
            if(buy<i){
                profit+=(i-buy);
                buy=i;
            }
            if(buy>i){
                buy=i;
            }
        }
        return profit;
    }
}