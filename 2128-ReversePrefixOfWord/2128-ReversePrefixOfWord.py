# Last updated: 8/21/2025, 12:07:47 PM
class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        c='a';s="";s1=""
        for i in range(len(word)):
            s+=word[i]
            if word[i]==ch:
                c=word.index(word[i])
                s1=s[::-1]
                break
        if c!="a":
            s=s1+word[c+1:len(word)+1]
        return s

        