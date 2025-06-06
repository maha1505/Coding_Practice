class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for index, digit in reversed(list(enumerate(digits))):
            if digit<9:
                digits[index]+=1
                return digits
            digits[index]=0
        return [1]+digits
