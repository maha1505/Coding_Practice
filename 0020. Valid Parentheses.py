class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for br in s:
            if br == '(':
                stack.append(')')
            elif br == '{':
                stack.append('}')
            elif br == '[':
                stack.append(']')
            elif not stack or stack.pop()!=br:
                return False
        return not stack
