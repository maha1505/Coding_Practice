import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        for(int num : nums){
            if(i==num){
                i++;
            }
            else if(num>i)
            break;
        }
        return i;
    }
}
