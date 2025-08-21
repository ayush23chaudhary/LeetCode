# Last updated: 8/21/2025, 12:08:15 PM
class Solution:
    def minPartitions(self, n: str) -> int:
        l=list(map(int,list(n)))
        return max(l)
        