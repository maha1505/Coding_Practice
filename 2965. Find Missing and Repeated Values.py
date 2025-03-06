class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        ans=[]
        l=[]
        for i in grid:
            for j in i:
                if j not in l:
                    l.append(j)
                else:
                    if j not in ans:
                        ans.append(j)
        l.sort()
        for i in range(len(l)):
            if l[i]!=i+1:
                ans.append(i+1)
                return ans
        ans.append(l[len(l)-1]+1)
        return ans
