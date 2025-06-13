class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int arrlen=nums.length;
        int left=0;
        int right=nums[arrlen-1]-nums[0]+1;
        while(left<right){
            int mid=(left+right) >>> 1;
            if(countPairsWithDifference(nums,mid) >= p){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    private int countPairsWithDifference(int[] nums, int maxDifference){
        int pairCount=0;
        for(int i=0;i<nums.length-1;++i){
            if(nums[i+1]-nums[i]<=maxDifference){
                pairCount++;
                i++;
            }
        }
        return pairCount++;
    }
}
