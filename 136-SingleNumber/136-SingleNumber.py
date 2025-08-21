# Last updated: 8/21/2025, 12:10:35 PM
class Solution:
    def singleNumber(self, n: List[int]) -> int:
        for i in set(n):
            if n.count(i)==1:
                return i