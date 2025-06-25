class Solution {
    public int countPrimes(int n) {		
        if(n<3) return 0;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        int c=n/2;
        for(int i=3;i*i<n;i+=2){
            if(arr[i]){
                for(int j=i*i;j<n;j+=2*i){
                    if(arr[j]){
                    arr[j]=false;
                    c--;
                    }
                }
            }
        }
        return c;
    }
}
/*
class Solution {
    public int countPrimes(int n) {
        int c=0;		
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
		    if(arr[i]) c++;
		}
        return c;
    }
}
*/
