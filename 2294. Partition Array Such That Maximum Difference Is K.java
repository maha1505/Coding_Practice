class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        int m=nums[0];
        for(int i=1;i<nums.length;++i){
            if(m+k<nums[i])
            {
                ++ans;
                m=nums[i];
            }
        }
        return ans;
    }
}
