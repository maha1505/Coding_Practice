class Solution {
    public int maxDiff(int num) {
        String ns=String.valueOf(num);
        String max=ns;
        String min=ns;
        for(int i=0;i<ns.length();++i){
            if(ns.charAt(i)!='9'){
                max=ns.replace(ns.charAt(i),'9');
                break;
            }
        }
        if(min.charAt(0)!='1') {
            min=min.replace(min.charAt(0),'1');
        }
        else{
            for(int i=1;i<min.length();++i){
                if(min.charAt(i)!='0' && min.charAt(i)!='1'){
                    min=min.replace(min.charAt(i),'0');
                    break;
                }
            }
        }
        return Integer.parseInt(max)-Integer.parseInt(min);
    }
}
