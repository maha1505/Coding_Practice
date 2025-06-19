class Solution {
    public String toLowerCase(String s) {
        String newS="";
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i);
            if(n>=65 && n<=90){
            newS+=(char) (n+32);
            }
            else
            newS+=s.charAt(i);
        }
        return newS;

        // return s.toLowerCase();
    }
}
