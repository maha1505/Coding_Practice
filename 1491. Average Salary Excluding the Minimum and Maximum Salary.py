class Solution:
    def average(self, salary: List[int]) -> float:
        c=len(salary)-2
        mini=min(salary)
        maxi=max(salary)
        s=0
        for i in salary:
            s+=i
        return (s-mini-maxi)/c
