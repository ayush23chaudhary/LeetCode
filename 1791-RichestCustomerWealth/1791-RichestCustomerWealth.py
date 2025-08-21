# Last updated: 8/21/2025, 12:08:22 PM
class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        l=[]
        for i in accounts:
            l.append(sum(i))
        return max(l)