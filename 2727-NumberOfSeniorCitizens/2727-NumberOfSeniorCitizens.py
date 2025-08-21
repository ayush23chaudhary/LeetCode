# Last updated: 8/21/2025, 12:06:52 PM
class Solution:
    def countSeniors(self, names: List[str]) -> int:
        c=0
        for name in names:
            if int(name[11:13]) >60:
                c+=1
        return c