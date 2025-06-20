class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int s=0;
        for(String str:operations){
            if(str.charAt(0)=='-' || str.charAt(2)=='-') s--;
            else s++;
        }
        return s;
    }
}
