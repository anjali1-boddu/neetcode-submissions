class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxi=0;
        while(left<right){
            int area=(right-left)*Math.min(heights[right],heights[left]);
            maxi=Math.max(maxi,area);
            if(heights[left]<heights[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return maxi;
    }
}
