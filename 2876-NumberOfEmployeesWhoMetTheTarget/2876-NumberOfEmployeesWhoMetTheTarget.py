# Last updated: 8/21/2025, 12:06:41 PM
class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        """
        :type hours: List[int]
        :type target: int
        :rtype: int
        """
        c=0
        for i in hours:
            if i>=target:
                c+=1
        return c
        