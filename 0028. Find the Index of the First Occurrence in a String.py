class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        a,b=len(haystack),  len(needle)
        for i in range(a-b+1):
            if haystack[i:i+b]==needle:
                return i
        return -1
