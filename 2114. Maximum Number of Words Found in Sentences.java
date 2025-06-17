class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String sentence:sentences){
            int word=1;
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==' ')
                word++;
            }
            count=Math.max(count,word);
        }
        return count;
    }
}
