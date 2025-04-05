class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr1[i]=max;
        }
        return arr1;
    }
}
