int maxProduct(int* nums, int numsSize) {
    int length=numsSize;
    for(int i=0;i<length;i++){
        for(int j=0;j<length-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }
    return ((nums[length-1]-1)*(nums[length-2]-1));
}
