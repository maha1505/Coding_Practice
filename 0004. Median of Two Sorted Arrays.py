class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l=[*nums1, *nums2]
        l.sort()
        m=len(l)//2
        ans=(l[m]+l[~m])/2
        return ans
