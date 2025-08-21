# Last updated: 8/21/2025, 12:07:55 PM
class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        ma=[]; mi=[]
        for i in range(2):
            ma.append(max(nums))
            mi.append(min(nums))
            nums.remove(max(nums))
            nums.remove(min(nums))
        a=ma[0]*ma[1]
        b=mi[0]*mi[1]
        return a-b