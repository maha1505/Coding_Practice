class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s=""
        m=len(word1) if len(word1)>len(word2) else len(word2)
        for i in range(m):
            if i<len(word1):
                s+=word1[i]
            if i<len(word2):
                s+=word2[i]
        return s
