# Last updated: 8/21/2025, 12:07:14 PM
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        l=[];s=list(heights)
        for i in range(len(heights)):
            c=heights.index(max(s))
            l.append(names[c])
            s.remove(max(s))
        return l
        