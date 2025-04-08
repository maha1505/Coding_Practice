class Solution {
    public int lastStoneWeight(int[] stones) {
        int stonesSize=stones.length;
        while(stonesSize>1){
            for(int i=0;i<stonesSize;i++){
                for(int j=0;j<stonesSize-1;j++)
                {
                    if(stones[j]>stones[j+1]){
                        int temp=stones[j];
                        stones[j]=stones[j+1];
                        stones[j+1]=temp;
                    }
                }
            }
            int m=stones[stonesSize-1];
            int n=stones[stonesSize-2];
            stones[stonesSize-2]=m-n;
            stonesSize-=1;
        }
    return stones[0];
    }
}
