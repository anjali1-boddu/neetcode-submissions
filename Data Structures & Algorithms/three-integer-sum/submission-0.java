class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    s.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(s);
    }
}
