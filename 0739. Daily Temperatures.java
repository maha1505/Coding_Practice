class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n=temps.length;
        int[] results=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temps[stack.peek()]<temps[i]){
                int ind=stack.pop();
                results[ind]=i-ind;
            }
            stack.push(i);
        }
        return results;    
    }
}
