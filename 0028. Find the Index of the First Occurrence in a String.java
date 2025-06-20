class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int a=haystack.length();
        int b=needle.length();
        for(int i=0;i<=(a-b);i++){
            String c="";
            int n=b,j=i;
            while(n>0){
                c+=haystack.charAt(j++);
                n--;
            }
            if(c.equals(needle))
            return i;
        }
        return -1;
    }
}
