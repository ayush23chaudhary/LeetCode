# Last updated: 8/21/2025, 12:07:00 PM
class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        es,ds=0,0
        s=""
        for i in nums:
            es+=i
            s+=str(i)
        for i in s:
            ds+=int(i)
        return abs(es-ds)
        