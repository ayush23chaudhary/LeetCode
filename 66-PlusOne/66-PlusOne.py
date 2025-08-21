# Last updated: 8/21/2025, 12:11:22 PM
class Solution(object):
    def plusOne(self, l):
        n=int(''.join(map(str,l)))
        l=[]
        l.extend(list(map(int,list(str(n+1)))))
        return l


        