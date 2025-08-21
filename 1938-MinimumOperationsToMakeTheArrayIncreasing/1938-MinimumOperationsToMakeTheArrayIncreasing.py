# Last updated: 8/21/2025, 12:07:59 PM
class Solution:
    def minOperations(self, nums: List[int]) -> int:
        c=0
        s=0
        for i in range(1,len(nums)):
            if nums[i]<=nums[i-1]:
                c= nums[i-1]-nums[i]+1
                s+=c
                nums[i]=nums[i]+c
        return s


        