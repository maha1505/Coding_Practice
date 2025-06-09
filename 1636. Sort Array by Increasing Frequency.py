from collections import Counter
class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        freq=Counter(nums)
        s_nums=sorted(nums, key=lambda x: (freq[x],-x))
        return s_nums
