# Last updated: 8/21/2025, 12:11:19 PM
class Solution(object):
    def mySqrt(self, x):
        s=sqrt(x)
        s=s-(s%1)
        return int(s)
        