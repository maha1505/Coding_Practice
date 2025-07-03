class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int i=0;
        Arrays.fill(arr, 0);
        int can=1;
        while(candies>0){
            if(candies>=can){
            arr[i]+=can;
            candies-=can;
            can++;
            }
            else{ 
              arr[i]+=candies;
              break;
            }
            if(i!=num_people-1) i++;
            else i=0;
        }
        return arr;
    }
}
