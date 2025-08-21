# Last updated: 8/21/2025, 12:07:01 PM
class Solution:
    def countDigits(self, num: int) -> int:
        l=list(map(int,list(str(num))))
        c=0
        for i in l:
            if num%i==0:
                c+=1
        return c