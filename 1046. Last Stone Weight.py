class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        n=len(stones)
        while n>1:
            stones.sort()
            m=stones.pop(n-1)
            n=stones.pop(n-2)
            stones.append(m-n)
            n=len(stones)
        return stones[0]
