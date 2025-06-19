class Solution {
    public String defangIPaddr(String address) {
        // String newaddress=address.replace(".","[.]");
        String newaddress="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
            newaddress+="[.]";
            else
            newaddress+=address.charAt(i);
        }
        return newaddress;
    }
}
