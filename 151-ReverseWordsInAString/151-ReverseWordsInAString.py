# Last updated: 8/21/2025, 12:10:31 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        return ' '.join((s.split())[::-1])
        