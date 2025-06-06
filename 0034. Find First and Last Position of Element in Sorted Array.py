class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l=[]
        l1=[]
        for index,i in enumerate(nums):
            if i==target:
                l.append(index)
        if not l:
            return [-1,-1]
        if len(l)<2:
            l.append(l[0])
        l1.append(l[0])
        l1.append(l[len(l)-1])
        return l1
