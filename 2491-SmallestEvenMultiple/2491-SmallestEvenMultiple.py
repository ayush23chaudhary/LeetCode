# Last updated: 8/21/2025, 12:07:15 PM
class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        if n%2!=0:
            return n*2
        else:
            return n
        