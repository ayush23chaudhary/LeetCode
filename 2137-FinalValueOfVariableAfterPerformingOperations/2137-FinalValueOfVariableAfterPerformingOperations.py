# Last updated: 8/21/2025, 12:07:46 PM
class Solution(object):
    def finalValueAfterOperations(self, op):
        """
        :type operations: List[str]
        :rtype: int
        """
        x=0
        for i in op:
            if i== "++X" or i=="X++":
                x+=1
            else:
                x-=1
        return x
        