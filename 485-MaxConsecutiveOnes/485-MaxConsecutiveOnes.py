# Last updated: 8/21/2025, 12:09:27 PM
class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l = {1 : 0}
        c = 0
        for i in nums :
            if i==1 :
                c+=1
                if l[1]<c:
                    l[1]=c
            # l.append(c)    
            else:
                c=0
        # if len(l)>0:
        #     return max(l)
        # else:
        #     return 0
        return l[1]