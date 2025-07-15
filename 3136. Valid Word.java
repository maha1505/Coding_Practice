class Solution {
    public boolean isValid(String word) {
        if(word.length()>=3 && isdigalp(word) && isvowel(word) && isconsonant(word)){

            return true;
        }
        return false;
    }
    boolean isdigalp(String word){
        for(char c:word.toCharArray())
        if(!Character.isLetterOrDigit(c))
        return false;
        return true;
    }
    boolean isvowel(String word){
        String vowel="aeiouAEIOU";
        int count=0;
        for(char c:word.toCharArray()){
            if(vowel.indexOf(c)!=-1)
            count++;
            if(count>=1) return true;
        }
        return false;
    }
    boolean isconsonant(String word){
        String vowel="aeiouAEIOU";
        for(char c:word.toCharArray()){
            if(Character.isLetter(c) && vowel.indexOf(c)==-1) return true;
        }
        return false;
    }
}
