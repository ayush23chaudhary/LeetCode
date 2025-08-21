# Last updated: 8/21/2025, 12:08:35 PM
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        l=[]
        for i in range(2):
            l.append(max(nums)-1)
            nums.remove(max(nums))
        a=l[0]*l[1]
        return a

        