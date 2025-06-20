class Solution:
    def maxDistance(self, s: str, k: int) -> int:
        ans=0
        for i in 'NE','SE','SW','NW':
            m,n=k,0
            for j in s:
                n+=j in i or m>0 or -1
                m-=j not in i
                ans=max(ans,n)
        return ans
