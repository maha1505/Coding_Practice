class Solution {
    public int maximumLength(int[] nums) {
        int even_count=0,odd_count=0,even_l=0,odd_l=0;
        for(int num:nums){
            if(num%2==0) {
                even_count++;
                even_l=Math.max(even_l,odd_l+1);
            }
            else {
                odd_count++;
                odd_l=Math.max(odd_l,even_l+1);
            }
        }
        return Math.max(Math.max(even_count,odd_count),Math.max(even_l,odd_l));
    }
}
