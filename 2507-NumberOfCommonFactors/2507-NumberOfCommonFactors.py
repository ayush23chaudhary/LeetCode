# Last updated: 8/21/2025, 12:07:12 PM
class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        c=0
        if a%b==0 or b%a==0:
            c+=1
        n=min(a,b)
        for i in range(1,n//2+1):
            if a%i==0 and b%i==0:
                c+=1
        return c
        