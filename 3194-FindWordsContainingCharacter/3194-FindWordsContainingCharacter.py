# Last updated: 8/21/2025, 12:06:30 PM
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        l=[]
        for i in range(len(words)):
            if x in words[i]:
                l.append(i)
        return l
        