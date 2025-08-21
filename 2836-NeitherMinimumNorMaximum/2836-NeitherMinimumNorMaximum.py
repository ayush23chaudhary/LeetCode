# Last updated: 8/21/2025, 12:06:44 PM
class Solution:
    def findNonMinOrMax(self, nums: List[int]) -> int:
        if len(nums) in [0,1,2]:
            return -1
        nums.remove(max(nums))
        nums.remove(min(nums))
        for i in nums:
            return i