class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        l=[]
        i=0
        while i<len(nums):
            start=nums[i]
            while i<len(nums)-1 and nums[i]+1==nums[i+1]:
                i+=1
            end=nums[i]
            if start==end:
                l.append(str(start))
            else:
                l.append(str(start)+"->"+str(end))
            i+=1
        return l
