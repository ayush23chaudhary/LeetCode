# Last updated: 8/21/2025, 12:06:58 PM
class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        l=[]
        for i in nums:
            for j in str(i):
                l.append(int(j))
        return l