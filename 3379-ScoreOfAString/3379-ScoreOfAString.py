# Last updated: 8/21/2025, 12:06:18 PM
class Solution:
    def scoreOfString(self, s: str) -> int:
        l=[abs(ord(s[i])-ord(s[i+1])) for i in range(len(s)-1) ]
        return sum(l)
        