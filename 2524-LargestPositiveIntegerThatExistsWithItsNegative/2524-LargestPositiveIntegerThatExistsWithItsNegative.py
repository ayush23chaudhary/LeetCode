# Last updated: 8/21/2025, 12:07:11 PM
class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        nums.sort()
        nums=nums[::-1]
        c=0
        for i in nums:
            if -(i) in nums:
                c=i
                break
        if c==0:
            return -1
        return c
        