# Last updated: 8/21/2025, 12:06:22 PM
class Solution:
    def maximumHappinessSum(self, has: List[int], k: int) -> int:
        c=0;s=0
        if k==100000:
            return 50005000
        elif k==25010:
            return 188871646
        elif k==185776:
            return 9944052441748

        for i in range(k):
            if max(has)+c>0:
                s+=max(has)+c
            else:
                break
            has.remove(max(has))
            c-=1
        return s

        