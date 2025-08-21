# Last updated: 8/21/2025, 12:07:24 PM
class Solution:
    def repeatedCharacter(self, s: str) -> str:
        for i in range(len(s)):
            if s[i] in s[0:i]:
                return s[i]        