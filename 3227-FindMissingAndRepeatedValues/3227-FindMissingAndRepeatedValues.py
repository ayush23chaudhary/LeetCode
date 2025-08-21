# Last updated: 8/21/2025, 12:06:26 PM
class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        l=[];n=0
        for i in grid:
            for j in i:
                l.append(j)
        m=max(l)
        l1=[]
        n1=len(grid[0])**2
        for i in range(1,n1+1): l1.append(i)
        l.sort()
        for i in range(len(l)):
            if l1[i] not in l:
                c=l1[i]
            if l.count(l[i])>1:
                n=l[i]
        return [n,c]
        
    
    