class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        l=[]
        k=heights.copy()
        k.sort(reverse=True)
        for i in range(len(names)):
            for j in range(len(heights)):
                if k[i]==heights[j]:
                    l.append(names[j])
        return l
