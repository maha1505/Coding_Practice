class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(char ch: stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1)
            c++;
        }
        return c;
    }
}
