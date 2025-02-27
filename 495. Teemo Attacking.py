class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        n=0
        if duration>0:
            for i in range(len(timeSeries)-1):
                n+=min(timeSeries[i+1]-timeSeries[i],duration)
        return n+duration
