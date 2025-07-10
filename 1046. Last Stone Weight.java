class Solution {
    public int lastStoneWeight(int[] stones) {
        int stonesSize=stones.length;
        while(stonesSize>1){
            // for(int i=0;i<stonesSize;i++){
            //     for(int j=0;j<stonesSize-1;j++)
            //     {
            //         if(stones[j]>stones[j+1]){
            //             int temp=stones[j];
            //             stones[j]=stones[j+1];
            //             stones[j+1]=temp;
            //         }
            //     }
            // }
            Arrays.sort(stones);
            int m=stones[stonesSize-1];
            int n=stones[stonesSize-2];
            stones[stonesSize-2]=m-n;
            stonesSize-=1;
        }
    return stones[0];
    }
}


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
        heap.add(stone);

        while(heap.size()>1){
            int m=heap.poll();
            int n=heap.poll();
            if(m!=n)
            heap.add(m-n);
        }
        return heap.isEmpty()?0:heap.peek();
    }
}
