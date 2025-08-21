# Last updated: 8/21/2025, 12:08:29 PM
class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        l=[]
        c=0
        for i in range(len(indices)):
           l.append(s[indices.index(i)])
        return "".join(l)