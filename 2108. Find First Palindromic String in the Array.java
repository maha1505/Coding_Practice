class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev+=word.charAt(i);
            }
            if(rev.equals(word)){
                return rev;
            }
        }
        return "";
    }
}
