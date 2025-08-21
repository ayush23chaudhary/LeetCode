# Last updated: 8/21/2025, 12:08:05 PM
class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        c=0
        m=0
        if ruleKey== "type":
            c=0
        elif ruleKey=="color":
            c=1
        else:
            c=2
        for i in range(len(items)):
            if items[i][c]==ruleValue:
                m+=1
        return m