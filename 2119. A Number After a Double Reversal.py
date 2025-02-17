class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        rev1=0
        rev2=0
        temp=num
        while(num):
            rev1=(rev1*10)+num%10
            num//=10
        while(rev1):
            rev2=(rev2*10)+rev1%10
            rev1//=10
        if(temp==rev2):
            return True
        return False
