class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        return ((nums[length-1]-1)*(nums[length-2]-1));
    }
}
