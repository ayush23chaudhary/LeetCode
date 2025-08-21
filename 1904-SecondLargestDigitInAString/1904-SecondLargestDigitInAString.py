# Last updated: 8/21/2025, 12:08:03 PM
class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        l=[]
        for i in s:
            if i in ["0","1","2","3",'4','5','6','7','8','9']:
                l.append(int(i))
        if l!=[]:
            n=l.count(max(l))
            for i in range(n):
                l.remove(max(l))

        
        if l==[]:
            return -1
        else:
            return max(l)