bool canJump(int* nums, int numsSize) {
    int pos=0;
    int max=0; 
    while(pos<=max)
    { 
        max=(pos+nums[pos]>max)?pos+nums[pos]:max; 
        if(max>=numsSize-1) 
        { 
            return true;
        }   
        pos++;
    }
    return false;
}
