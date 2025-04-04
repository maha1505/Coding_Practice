class Solution {
    public int trap(int[] height) {
        int heightSize=height.length;   
        int l=0,r=heightSize-1;
        int lmax=0,rmax=0,sum=0;
        while(l<=r){
            if(height[l]<height[r]){
                if(lmax<height[l]){
                    lmax=height[l];
                }
                sum+=lmax-height[l];
                l++;
            }
            else{
                if(rmax<height[r]){
                    rmax=height[r];
                }
                sum+=rmax-height[r];
                r--;
            }
        }
        return sum;
        }
}
