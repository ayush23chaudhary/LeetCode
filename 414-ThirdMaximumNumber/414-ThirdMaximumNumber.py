# Last updated: 8/21/2025, 12:09:37 PM
class Solution(object):
    def thirdMax(self, n):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=[]
        #n=sorted (n)
        #n=n[::-1]
        '''for i in sorted(n)[::-1]:
            if i not in l:
                l.append(i)
        if len(l)>2:
            return l[2]
        else:
            return max(l)'''
        for i in set(n):
            l.append(i)
        l=sorted(l)[::-1]
        if len(l)>2:
            return l[2]
        else:
            return max(l)

        