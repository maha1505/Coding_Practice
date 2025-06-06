class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        for i in range(n,n+11):
            p=1
            temp=i
            while(temp):
                p*=(temp%10)
                temp//=10
            if p%t==0:
                return i
