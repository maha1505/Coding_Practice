class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        for i in range(len(flowerbed)):
            t=0
            p=-2
            for i in range(len(flowerbed)):
                if flowerbed[i]:
                    t+=(i-p-2)//2
                    p=i
            t+=(len(flowerbed)-p-1)//2
            return t>=n
