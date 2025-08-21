# Last updated: 8/21/2025, 12:10:44 PM
class Solution:
    def generate(self, n: int) -> List[List[int]]:
        import math
        l=[]
        for i in range(n):
            t=[]
            for j in range(i):
                t.append(math.comb(i,j))
            t.append(1)
            l.append(t)
        return l