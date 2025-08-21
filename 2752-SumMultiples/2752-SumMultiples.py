# Last updated: 8/21/2025, 12:06:50 PM
class Solution:
    def sumOfMultiples(self, n: int) -> int:
        l=[]
        for i in range(1,n+1):
            if i%3==0 or i%5==0 or i%7==0:
                l.append(i)
        return sum(l)


        