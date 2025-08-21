# Last updated: 8/21/2025, 12:08:25 PM
class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        s1=''.join(word1)
        s2=''.join(word2)
        if s1==s2:
            return True
        else:
            return False