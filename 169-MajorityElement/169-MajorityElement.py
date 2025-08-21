# Last updated: 8/21/2025, 12:10:20 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        for i  in set(nums):
            if nums.count(i) > len(nums)/2:
                return i
