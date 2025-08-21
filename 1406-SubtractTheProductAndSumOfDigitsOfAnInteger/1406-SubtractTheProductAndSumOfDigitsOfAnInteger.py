# Last updated: 8/21/2025, 12:08:56 PM
class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        s=0;p=1
        for i in str(n):
            s+=int(i)
            p*=int(i)
        return p-s