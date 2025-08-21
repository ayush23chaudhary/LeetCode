# Last updated: 8/21/2025, 12:06:54 PM
class Solution(object):
    def leftRightDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ls,rs=[],[sum(nums[1:len(nums)])]
        for i in range(len(nums)):
            ls.append(sum(nums[0:i]))
            
        s=rs[0]
        for i  in range(1,len(nums)):
            s-=nums[i]
            rs.append(s)
            
        l=[]
        for i in range(len(nums)):
            l.append(abs(ls[i]-rs[i]))
        return l
