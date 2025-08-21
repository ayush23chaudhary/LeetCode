# Last updated: 8/21/2025, 12:07:56 PM
class Solution:
    def sortSentence(self, s: str) -> str:
        l=list(map(str,s.split()))
        n=len(l)
        t=[]
        for i in range(n):
            t.append(str(i+1))
        for i in l:
            c=i[-1]
            t[int(c)-1]=t[int(c)-1].replace(c,i[0:-1])
        return " ".join(t)



