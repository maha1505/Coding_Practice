bool isPossibleToSplit(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++)
    {
        int c=0;
        for(int j=0;j<numsSize;j++)
        {
            if(nums[j]==nums[i])
            c++;
        }
        if (c>2)
        return false;
    }
    return true;
}
