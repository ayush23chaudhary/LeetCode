# Last updated: 8/21/2025, 12:08:45 PM
class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in nums:
            c=0
            for j in nums:
                if i>j:
                    c+=1
            l.append(c)
        return l