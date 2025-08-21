# Last updated: 8/21/2025, 12:08:52 PM
class Solution:
    def sumZero(self, n: int) -> List[int]:
        l=[]
        for i in range(1,n//2+1):
            l.append(i)
            l.append(-i)
        if n%2!=0:
            l.append(0)
        return l


        