class Solution {
    public String findValidPair(String s) {
        for(int i=0;i<s.length()-1;i++){
            char c1=s.charAt(i),c2=s.charAt(i+1);
            if(c1==c2) continue;
            int count1=countchar(s,c1),count2=countchar(s,c2);
            if(c1-'0'==count1 && c2-'0'==count2) 
            return ""+c1+c2;
        }
        return "";
    }
    int countchar(String s,char ch){
        int count=0;
        for(char c:s.toCharArray()){
            if(ch==c) count++;
        }
        return count;
    }
}
