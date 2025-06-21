class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) || s.charAt(i)-32==s.charAt(i+1) ||  s.charAt(i)+32==s.charAt(i+1)) continue;
            else count++;
        }
        return count;
    }
}
// class Solution {
//     public int countKeyChanges(String s) {
//         String s1=s.toLowerCase();
//         int count=0;
//         for(int i=0;i<s1.length()-1;i++){
//             if(s1.charAt(i)!=s1.charAt(i+1)) count++;
//         }
//         return count;
//     }
// }
