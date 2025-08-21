# Last updated: 8/21/2025, 12:06:23 PM
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        l=[]
        for i in nums:
            if i<k:
                l.append(i)
        return len(l)