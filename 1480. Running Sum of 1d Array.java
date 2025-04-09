class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,k=0;
        int len=nums.length;
        int[] arr=new int[len];
        for(int i: nums){
            sum+=i;
            arr[k++]=sum;
        }
        return arr;
    }
}
