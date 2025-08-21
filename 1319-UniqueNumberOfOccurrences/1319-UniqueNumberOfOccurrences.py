# Last updated: 8/21/2025, 12:08:59 PM
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        l=[]
        for i in set(arr):
            if arr.count(i) not in l:
                l.append(arr.count(i))
            else:
                return False
        return True