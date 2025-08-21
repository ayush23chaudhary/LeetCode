# Last updated: 8/21/2025, 12:07:53 PM
class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        l=[]
        for i in range(len(nums)):
            l.append(nums[nums[i]])
        return l
        