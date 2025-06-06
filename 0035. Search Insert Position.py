class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target>nums[-1]:
            return len(nums)
        for i, num in enumerate(nums):
            if target == num:
                return i
            elif target < num:
                return i
