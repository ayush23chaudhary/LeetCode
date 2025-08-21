# Last updated: 8/21/2025, 12:09:11 PM
class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        l=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        a=list("abcdefghijklmnopqrstuvwxyz")
        cl=[]
        t=""
        for  i in words:
            for j in i:
                t+=l[a.index(j)]
            cl.append(t)
            t=''
        cl=set(cl)
        return len(cl)