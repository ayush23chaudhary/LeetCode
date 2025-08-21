# Last updated: 8/21/2025, 12:11:26 PM
class Solution(object):
    def lengthOfLastWord(self, s):
        s.strip(" ")
        return len(s.split()[-1])
        