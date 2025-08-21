# Last updated: 8/21/2025, 12:08:40 PM
class Solution:
    def kidsWithCandies(self, candies: List[int], ec: int) -> List[bool]:
        l=[]
        for i in candies:
            if i+ec >= max(candies):
                l.append(True)
            else:
                l.append(False)
        return l