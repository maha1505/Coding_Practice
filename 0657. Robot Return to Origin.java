class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,l=0,d=0,r=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') u++;
            else if(ch=='L') l++;
            else if(ch=='D') d++;
            else r++;
        }
        return (u-d)==0 && (l-r)==0;
    }
}
