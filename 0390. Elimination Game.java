class Solution {
    public int lastRemaining(int n) {
        int survive=1,move=1,r=n;
        boolean lr=true;
        while(r>1){
            if(lr || r%2==1) survive+=move;
            r/=2;
            move*=2;
            lr=!lr;
        }
        return survive;
    }
}
