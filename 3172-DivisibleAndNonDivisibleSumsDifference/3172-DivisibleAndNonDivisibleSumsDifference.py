# Last updated: 8/21/2025, 12:06:32 PM
class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        l,l1=[],[]
        for i in range(1,n+1):
            if i%m!=0:
                l.append(i)
            else:
                l1.append(i)
        s=sum(l)-sum(l1)
        return s