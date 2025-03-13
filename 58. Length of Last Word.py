class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l=s.split()
        c=0
        for i in l[-1]:
            c+=1
        return c
