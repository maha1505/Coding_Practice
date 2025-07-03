class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int num:fruits){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=num){
                    c++;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return fruits.length-c;
    }
}
