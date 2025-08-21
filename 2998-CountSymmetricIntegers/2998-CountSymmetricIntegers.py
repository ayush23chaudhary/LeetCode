# Last updated: 8/21/2025, 12:06:35 PM
class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        c=0
        for i in range(low,high+1):
            if len(str(i))%2==0:
                s=str(i);n=len(s)//2
                if sum(list(map(int,s[0:n])))== sum(list(map(int,s[n:]))):
                    c+=1
        return c