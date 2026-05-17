class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int n=prices.length;
        int maxi=0;
        while(r<n){
            if(prices[l]<prices[r]){
                maxi=Math.max(maxi,prices[r]-prices[l]);
            } 
            else{
                l=r;
            }
            r+=1;
        }
        return maxi;
    }
}
