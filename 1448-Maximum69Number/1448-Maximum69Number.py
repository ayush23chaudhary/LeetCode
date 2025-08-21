# Last updated: 8/21/2025, 12:08:49 PM
class Solution:
    def maximum69Number (self, num: int) -> int:
        l=list(map(int,list(str(num))))
        if l.count(6)!=0:
            c=l.index(6)
            l[c]=9
        l=list(map(str,l))
        return int("".join(l))


