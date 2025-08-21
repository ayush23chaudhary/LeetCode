# Last updated: 8/21/2025, 12:08:23 PM
class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        c=0
        for i in words:
            m=1
            for j in i:
                if j in allowed:
                    pass
                else:
                    m=0
            if m==1:
                c+=1
        return c

        