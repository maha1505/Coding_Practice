class Solution {
    public int maxProduct(int n) {
        List<Integer> num=new ArrayList<>();
        while(n!=0){
            num.add(n%10);
            n/=10;
        }
        Collections.sort(num);
        return num.get(num.size()-1)*num.get(num.size()-2);
    }
}
