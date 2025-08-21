# Last updated: 8/21/2025, 12:09:16 PM
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        c=0
        for i in set(jewels):
            c+=stones.count(i)
        return c

        