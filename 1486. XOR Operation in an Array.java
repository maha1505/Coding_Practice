class Solution {
    public int xorOperation(int n, int start) {
        int s=start;
        while(n!=1){
            start+=2;
            s=s^(start);
            n--;
        }
        return s;
    }
}
