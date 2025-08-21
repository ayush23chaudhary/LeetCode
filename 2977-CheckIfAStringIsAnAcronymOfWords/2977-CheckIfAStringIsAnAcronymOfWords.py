# Last updated: 8/21/2025, 12:06:36 PM
class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        s=list(s)
        c=1
        if len(words)!=len(s):
            return False
        else:
            for i in range(len(words)):
                if words[i][0]==s[i]:
                    pass
                else:
                    c=0
            if c==1:
                return True
            else:
                return False
                