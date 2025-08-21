# Last updated: 8/21/2025, 12:08:10 PM
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        s=0
        for i in set(nums):
            if nums.count(i)==1:
                s+=i
        return s
        