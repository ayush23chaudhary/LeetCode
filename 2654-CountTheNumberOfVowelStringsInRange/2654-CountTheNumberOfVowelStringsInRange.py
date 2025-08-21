# Last updated: 8/21/2025, 12:06:57 PM
class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        c=0
        for i in  range(left,right+1):
            if words[i][0] in "aeiouAEIOU" and words[i][-1] in "aeiouAEIOU":
                c+=1
        return c