# Last updated: 8/21/2025, 12:07:40 PM
class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        l=[]
        for i in sentences:
            l.append(len(i.split()))
        return max(l)
        