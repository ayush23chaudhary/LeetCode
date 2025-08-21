# Last updated: 8/21/2025, 12:06:20 PM
class Solution(object):
    def findLatestTime(self, s):
        """
        :type s: str
        :rtype: str
        """
        s=list(s)
        if s[0] == "?":
            if s[1] in ["1","0","?"]:
                s[0]= "1"
            else:
                s[0]= "0"
        if s[1]=="?":
            if  s[0] in ["1","?"]:
                s[1]="1"
            else:
                s[1]="9"
        if s[3]=="?":
            s[3]="5"
        if s[4]=="?":
            s[4]="9"
        return ''.join(s)
        