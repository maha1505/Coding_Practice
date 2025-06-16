class Solution {
    public int maximumDifference(int[] nums) {
        int n=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j] && Math.abs(nums[i]-nums[j])>n)
                n=Math.abs(nums[i]-nums[j]);
            }
        }
        return n;
    }
}
