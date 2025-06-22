class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> arr=new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            StringBuilder str = new StringBuilder();
            for(int j=i;j<i+k;j++){
                if(j<s.length()){
                    str.append(s.charAt(j));
                }
                else{
                    str.append(fill);
                }
            }
            arr.add(str.toString());
        }
        return arr.toArray(new String[0]);
    }
}
// class Solution {
//     public String[] divideString(String s, int k, char fill) {
//         List<String> arr=new ArrayList<>();
//         for(int i=0;i<s.length();i+=k){
//             String str="";
//             for(int j=i;j<i+k;j++){
//                 if(j<s.length()){
//                     str+=s.charAt(j);
//                 }
//                 else{
//                     str+=fill;
//                 }
//             }
//             arr.add(str);
//         }
//         return arr.toArray(new String[0]);
//     }
// }
