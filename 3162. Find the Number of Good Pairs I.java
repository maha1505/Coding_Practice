class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        int l1=nums1.length;
        int l2=nums2.length;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    c+=1;
                }
            }
        }
        return c;
    }
}
