import java.util.Arrays;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apple_sum=0;
        int j=0,c=0;
        for (int num : apple) {
            apple_sum += num;  
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            c+=capacity[i];
            j+=1;
            if(c>=apple_sum){
                return j;
            }
        }
        return j;
    }
}
