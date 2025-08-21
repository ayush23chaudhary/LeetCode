# Last updated: 8/21/2025, 12:08:08 PM
class Solution:
    def mergeAlternately(self, w1: str, w2: str) -> str:
        s=""
        for i in range(max(len(w1),len(w2))):
            if len(w1)>i:
                s+=w1[i]
            if len(w2)>i:
                s+=w2[i]
        return s
