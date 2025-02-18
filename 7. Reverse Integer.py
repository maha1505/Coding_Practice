class Solution(object):
    def reverse(self, x):
        t=x
        y=0
        if x<0:
            x*=(-1)
        while x>0:
            y= (y*10) +x%10
            x//=10
        if y<-2**31 or y>2**31 -1:
            return 0
        if t<0:
            return -y
        return y
        
