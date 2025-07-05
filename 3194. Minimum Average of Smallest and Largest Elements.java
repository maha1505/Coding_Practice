class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int m=0,n=nums.length-1;
        double k=0;
        double min=Double.MAX_VALUE;
        while(m<n){
            k=(nums[m]+nums[n])/2.0;
            min=k<min?k:min;
            m++;
            n--;
        }
        return min;
    }
}
