class Solution {
    public List<List<Integer>> combine(int n, int k) {
           int[] num=new int[n];
           for(int i=1;i<=n;i++) num[i-1]=i;
           List<Integer> a=new ArrayList<>();
           List<List<Integer>> ans=new ArrayList<>();
           return backtrack(num,k,0,a,ans);

    }
    static List<List<Integer>> backtrack(int[] num,int r,int ind,List<Integer> fl,List<List<Integer>> res){
        if(fl.size()==r){
            res.add(new ArrayList<>(fl));
            return res;
        }
        for(int i=ind;i<num.length;i++){
            fl.add(num[i]);
            backtrack(num,r,i+1,fl,res);
            fl.remove(fl.size()-1);
        }
        return res;
    }
}
