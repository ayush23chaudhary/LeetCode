# Last updated: 8/21/2025, 12:08:02 PM
class Solution:
    def squareIsWhite(self, coor: str) -> bool:
        a,d=coor[0],int(coor[1])
        if a in ["a","c","e","g"] and d in [2,4,6,8]:
            return True
        elif a in ["b","d","f","h"] and d in [1,3,5,7]:
            return True
        else:
            return False