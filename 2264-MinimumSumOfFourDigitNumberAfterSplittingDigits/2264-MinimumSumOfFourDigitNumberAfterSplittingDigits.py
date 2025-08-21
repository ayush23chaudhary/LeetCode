# Last updated: 8/21/2025, 12:07:33 PM
class Solution:
    def minimumSum(self, num: int) -> int:
        l=list(map(int,list(str(num))))
        l.sort()
        l=list(map(str,l))
        s=int(l[0]+l[2])+int(l[1]+l[3])
        return s
