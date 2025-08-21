# Last updated: 8/21/2025, 12:07:39 PM
class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        c=1
        for i in words:
            if i==i[::-1]:
                c=0
                return i 
        if c==1:
            return ""
               