# Last updated: 8/21/2025, 12:06:19 PM
class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        l=list(map(int,list(str(x))))
        s=sum(l)
        if x%s==0:
            return s
        return -1
        