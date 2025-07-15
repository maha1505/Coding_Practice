class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int dig=countdig(nums[i]);
            if(dig==i) return i;
        }
        return -1;
    }
    int countdig(int n){
        int c=0;
        while(n>0){
            c+=n%10;
            n/=10;
        }
        return c;
    }
}
