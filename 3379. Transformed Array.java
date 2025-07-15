class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] list=new int[n];
        for(int i=0;i<n;i++){
            int val=nums[i];
            int ind=val+i;
            if(val>0)
                while(ind>=n)
                    ind-=n;
            else
                while(ind<0)
                    ind+=n;
            list[i]=nums[ind];
        }
        return list;
    }
}
