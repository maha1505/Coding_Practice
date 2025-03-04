class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n<-2**31 or n>2**31 -1 or n<=0:
            return False
        if n==1:
            return True
        for i in range(1,20):
            if pow(3,i)==n:
                return True
        return False
