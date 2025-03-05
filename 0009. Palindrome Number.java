class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int pal_num=0;
        int temp=x;
        while(temp>0)
        {
            pal_num*=10;
            pal_num+=temp%10;
            temp/=10;
        }
        if(x==pal_num)
        return true;
        return false;
    }
}
