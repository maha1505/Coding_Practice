void duplicateZeros(int* arr, int arrSize) {
    for(int i=0;i<arrSize;i++){
        if(arr[i]==0){
            for(int j=arrSize-1;j>i+1;j--){
                arr[j]=arr[j-1];
            }
            if(i+1<arrSize)
            arr[i+1]=0;
            i+=1;
        }
    }
}
