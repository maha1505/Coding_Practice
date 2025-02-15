class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        val_index={}
        for index, value in enumerate(nums):
            comp=target-value
            if comp in val_index:
                return [val_index[comp], index]
            val_index[value]=index
