class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n == 0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxi=0;
        for(int it:set){
            if(!set.contains(it-1)){
                int c=1;
                int x=it;
                while(set.contains(x+1)){
                    x+=1;
                    c+=1;
                }
                maxi=Math.max(maxi,c);
            }
        }
        return maxi;
    }
}