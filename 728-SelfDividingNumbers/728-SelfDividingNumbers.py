# Last updated: 8/21/2025, 12:09:17 PM
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        l=[];c=1
        for i in range(left,right+1):
            for j in (list(map(int,list(str(i))))):
                if j==0:
                    c=0
                elif i%j==0:
                    pass
                else:
                    c=0
            if c==1:
                l.append(i)
            c=1
        return l