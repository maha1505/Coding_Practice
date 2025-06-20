class Solution {
    public int differenceOfSum(int[] nums) {
        int ele_sum=0,digit_sum=0;
        for(int num:nums){
            ele_sum+=num;
            while(num>0){
                digit_sum+=num%10;
                num/=10;
            }
        }
        return ele_sum-digit_sum;
    }
}
