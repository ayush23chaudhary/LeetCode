# Last updated: 8/21/2025, 12:08:36 PM
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        l=[]
        for i in paths:
            for j in i:
                l.append(j)
        for i  in range(1,len(l),2):
            if l.count(l[i])==1:
                return l[i]        