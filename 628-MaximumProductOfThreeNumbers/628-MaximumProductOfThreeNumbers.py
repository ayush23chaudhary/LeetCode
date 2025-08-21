# Last updated: 8/21/2025, 12:09:20 PM
class Solution(object):
    def maximumProduct(self, n):
        n=sorted(n)
        c=n[0]*n[1]*n[-1]
        d=n[-1]*n[-2]*n[-3]
        if c>d:
            return(c)
        else:
            return d        