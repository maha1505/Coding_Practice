class Solution {
    public boolean isValid(String s) {
        stack s1=new stack();
        for(char ch:s.toCharArray()){
            if(ch!=')' && ch!='}' && ch!=']')
            s1.push(ch);
            else{
                if(s1.isEmpty()) return false;
                char check=s1.peek();
                if((ch==')' && check!='(') || (ch=='}' && check!='{') || (ch==']' && check!='[')) return false;
                s1.pop();
            }
        }
        return s1.isEmpty();
    }
}
class stack{
    Node top;
    class Node{
        char data;
        Node next;
        Node(char d){
            data=d;
            next=null;
        }
    }
    public void push(char val){
        Node newNode=new Node(val);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public char peek(){
        if(top==null) return '\0';
        return top.data;
    }
    public void pop(){
        if(top!=null)
        top= top.next;
    }
    public boolean isEmpty(){
        return top==null;
    }
}
