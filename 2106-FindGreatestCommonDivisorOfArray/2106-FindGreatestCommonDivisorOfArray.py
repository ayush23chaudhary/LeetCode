# Last updated: 8/21/2025, 12:07:50 PM
import math
class Solution:
    def findGCD(self, nums: List[int]) -> int:
        s=math.gcd(min(nums),max(nums))
        return s
