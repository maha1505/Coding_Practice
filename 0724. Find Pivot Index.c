int pivotIndex(int* nums, int numsSize) {
    int left=0,right=0,temp=0;
    for(int i=0;i<numsSize;i++)
    right+=nums[i];
    for(int i=0;i<numsSize;i++){
        temp=nums[i];
        right-=nums[i];
        if(left==right){
            return i;
        }
        left+=nums[i];
    }
    return -1;
}
