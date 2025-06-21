class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int can=0;
        int c=flowerbed.length;
        if(c>1){
        if(flowerbed[0]==0 &flowerbed[1]!=1){
        can++;
        flowerbed[0]=1;
        }
        if(flowerbed[c-1]==0 &flowerbed[c-2]!=1){
        can++;
        flowerbed[c-1]=1;
        }
        for(int i=1;i<c-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                can++;
                flowerbed[i]=1;
            }
        }
        }
        else{
            if(flowerbed[0]==0)
            can++;
        }
        return can>=n;
    }
}
