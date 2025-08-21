# Last updated: 8/21/2025, 12:12:19 PM
class Solution(object):
    def twoSum(self, n, t):
        for i in range(len(n)):
            for j in range(i,len(n)):
                if n[i]+n[j]==t and i!=j: 
                    return[i,j]
                    break 
            
                 
    