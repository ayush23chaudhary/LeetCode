# Last updated: 8/21/2025, 12:07:38 PM
class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        s=str(num).strip("0")
        n=s[::-1]
        n=n[::-1]
        if num==0:
            return True
        if n==str(num):
            return True
        return False