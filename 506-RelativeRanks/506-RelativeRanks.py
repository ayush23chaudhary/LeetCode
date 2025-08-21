# Last updated: 8/21/2025, 12:09:26 PM
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        l=list(score)
        for i in range(len(score)):
            c=score.index(max(l))
            l.remove(max(l))
            if i==0:
                score[c]='Gold Medal'
            elif i==1:
                score[c]="Silver Medal"
            elif i==2:
                score[c]="Bronze Medal"
            else:
                score[c]=str(i+1)
        return score

        