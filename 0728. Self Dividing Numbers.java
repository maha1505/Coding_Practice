class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean f=true;
            while(temp!=0){
                int d=temp%10;
                if(d==0 || i%d!=0) f=false;
                temp/=10;
            }
            if(f) arr.add(i);
        }
        return arr;
    }
}
