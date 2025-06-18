class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int sum=0;
        int j=people.length-1,i=0;
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            sum++;
        }
        return sum;
    }
}
