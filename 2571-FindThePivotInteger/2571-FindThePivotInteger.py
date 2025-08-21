# Last updated: 8/21/2025, 12:07:05 PM
class Solution:
    def pivotInteger(self, n: int) -> int:
        l=[]
        for i in range(1,n+1):
            l.append(i)
        l.reverse()
        s=0
        for i in range(len(l)):
            s+=l[i]
            if s==sum(l[i::]):
                return l[i]
        return -1


        