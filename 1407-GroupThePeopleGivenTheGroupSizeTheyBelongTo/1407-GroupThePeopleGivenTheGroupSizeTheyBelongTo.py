# Last updated: 8/21/2025, 12:08:55 PM
class Solution:
    def groupThePeople(self, gs: List[int]) -> List[List[int]]:
        l=[]
        for i in gs:
            if i!="*":
                c=[]
                for j in range(i):
                    c.append(gs.index(i))
                    gs.insert(gs.index(i),"*")
                    gs.remove(i)
                l.append(c)
            
        return l
