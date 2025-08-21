# Last updated: 8/21/2025, 12:08:12 PM
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        c,l=0,[0]
        for i in gain:
            c+=i
            l.append(c)
           
        return max(l)