class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int num:nums){
            if(count<1 || num!=nums[count-1]){
                nums[count]=num;
                count++;
            }
        }
        return count;
    }
}
