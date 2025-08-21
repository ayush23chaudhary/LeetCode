# Last updated: 8/21/2025, 12:09:38 PM
class Solution:
    def reverseVowels(self, s: str) -> str:
        l=[]
        for i in range(len(s)):
            if s[i].lower() in "aeiou":
                l.append(s[i])
        l=l[::-1]
        s1=""
        for i in s:
            if i.lower() in "aeiou":
                s1+=l[0]
                l.pop(0)
            else:
                s1+=i
        return s1

