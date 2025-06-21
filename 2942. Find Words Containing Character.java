class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> count=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            // for(char ch:words[i].toCharArray()){
            //     if(ch==x){
            //         count.add(i);
            //         break;
            //     }
            // }
            if(words[i].indexOf(x)!=-1) count.add(i);
        }
        return count;
    }
}
