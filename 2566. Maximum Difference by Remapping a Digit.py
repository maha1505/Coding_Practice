class Solution:
    def minMaxDifference(self, num: int) -> int:
        s=str(num)
        m=(int)(s.replace(s[0],'0'))
        for c in s:
            if(c!='9'):
                return int (s.replace(c,'9'))-m
        return num-m
