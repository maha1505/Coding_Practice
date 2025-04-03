int maxArea(int* height, int heightSize) {
    int i=0,temp=0,cap;
    int j=heightSize-1;
    for(int k=0;k<heightSize;k++){
        if(height[i]>height[j])
        cap=(j-i)*height[j];
        else
        cap=(j-i)*height[i];        
        if(height[i]>height[j]){
            j--;
        }
        else{
        i++;
        }
        if(cap>temp)
        temp=cap;
    }
    return temp;
}
