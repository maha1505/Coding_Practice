class Solution {
    public int heightChecker(int[] heights) {
        int[] copy=Arrays.copyOf(heights, heights.length);
        int c=0;
        Arrays.sort(copy);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=copy[i]) c++;
        }
        return c;
    }
}
