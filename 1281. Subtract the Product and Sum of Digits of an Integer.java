class Solution {
    public int subtractProductAndSum(int n) {
        int m=1,s=0;
        int temp=n;
        while (temp>0){
            m*=temp%10;
            s+=temp%10;
            temp/=10;
        }
        return m-s;
    }
}
