# Last updated: 8/21/2025, 12:07:58 PM
class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        s=s.split()
        l=[]
        for i in range(k):
            l.append(s[i])
        return " ".join(l)

        