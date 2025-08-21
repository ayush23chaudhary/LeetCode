# Last updated: 8/21/2025, 12:08:13 PM
class Solution:
    def totalMoney(self, n: int) -> int:
        s=0
        c=1
        d=0
        if n%7==0:
            n1=n//7
        else:
            n1=n//7+1
        for i in range(n1):
            for j in range(c,7+c):
                s+=j
                d+=1
                if d==n:
                    break
            c+=1
        return s


        