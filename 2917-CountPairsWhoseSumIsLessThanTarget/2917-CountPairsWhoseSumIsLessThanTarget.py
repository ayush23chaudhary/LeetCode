# Last updated: 8/21/2025, 12:06:37 PM
class Solution(object):
    def countPairs(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        l=[[i,j] for i in range(len(nums)) for j in range(i,len(nums)) if i < j  and nums[i] + nums[j] < target ]
        return len(l)
        