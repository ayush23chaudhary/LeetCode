# Last updated: 8/21/2025, 12:08:43 PM
class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        t=[]
        for i in range(len(nums)):
            t.insert(index[i],nums[i])
        return t