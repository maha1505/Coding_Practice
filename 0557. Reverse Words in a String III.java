class Solution {
    public String reverseWords(String s) {
        int i=0;
        String[] c=s.split(" ");
        StringBuilder rev=new StringBuilder();
        for(String word:c){
            rev.append(new StringBuilder(word).reverse()).append(" ");
        }
        return rev.toString().trim();
    }
}
