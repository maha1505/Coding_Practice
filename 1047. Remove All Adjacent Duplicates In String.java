class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!(st.isEmpty()) && ch==st.peek()) st.pop();
            else st.push(ch);
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()) res.insert(0,st.pop());
        return res.toString();
    }
}
