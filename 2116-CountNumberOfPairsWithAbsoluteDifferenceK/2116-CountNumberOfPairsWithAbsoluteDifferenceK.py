# Last updated: 8/21/2025, 12:07:49 PM
class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        n=len(nums)
        l=[["#"] for  i in range(n) for j in range(i,n) if abs(nums[i]-nums[j]) == k]
        return len(l)