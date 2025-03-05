class Solution {
    public boolean containsDuplicate(int[] nums) {
        LinkedHashSet<Integer> s=new LinkedHashSet();
        for(int i=0;i<nums.length;i++)
        {
            if(!s.add(nums[i])) return true;
        }
        return false;
    }
}
