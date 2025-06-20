class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        for(int num:nums){
            s+=num<10?num:-num;
        }
        return s!=0;
    }
}
