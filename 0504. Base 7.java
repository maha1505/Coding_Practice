class Solution {
    public String convertToBase7(int num) {
        // return Integer.toString(num,7);
        if(num==0) return "0";
        int x=Math.abs(num);
        String s="";
        
        while(x!=0){
            s=x%7+s;
            x/=7;
        }
        if(num<0) s="-"+s;
        return s;
    }
}
