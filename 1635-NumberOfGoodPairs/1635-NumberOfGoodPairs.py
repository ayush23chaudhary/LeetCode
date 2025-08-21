# Last updated: 8/21/2025, 12:08:30 PM
class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=[[nums[i],nums[j]] for i in range(len(nums)) for j in range(i,len(nums)) if nums[i] == nums[j] and i<j]
        return len(l)