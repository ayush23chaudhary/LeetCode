# Last updated: 8/21/2025, 12:06:25 PM
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        m=0
        c=0
        for i in set(nums):
            if nums.count(i)>m:
                m=nums.count(i)
        for i in set(nums):
            if nums.count(i)==m:
                c+=m
        return c