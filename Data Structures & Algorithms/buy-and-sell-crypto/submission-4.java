class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxp=0;
        int mini=prices[0];
        for(int i=1;i<n;i++){
            int cost=prices[i]-mini;
            maxp=Math.max(maxp,cost);
            mini=Math.min(mini,prices[i]);
        }
        return maxp;
    }
}
