from typing import List

class Solution:
    def find132pattern(self, nums: List[int]) -> bool:
        if len(nums) < 3:
            return False
        stack = []
        min_val = float('-inf') 
        for num in reversed(nums):
            if num < min_val:
                return True
            while stack and stack[-1] < num:
                min_val = stack.pop() 
            stack.append(num)  
        return False
