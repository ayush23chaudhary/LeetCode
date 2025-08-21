# Last updated: 8/21/2025, 12:06:42 PM
class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        c=0
        s=""
        n=len(words)
        for i in range(n):
            s=words[i][::-1]
            for j in range(i+1,n):
                if words[j]==s:
                    c+=1
        return c

        