# Last updated: 8/21/2025, 12:08:32 PM
class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        c=0
        l=[]
        for i in nums:
            c+=i
            l.append(c)
        return l
        