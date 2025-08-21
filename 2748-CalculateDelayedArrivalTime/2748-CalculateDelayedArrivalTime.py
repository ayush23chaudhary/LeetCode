# Last updated: 8/21/2025, 12:06:51 PM
class Solution:
    def findDelayedArrivalTime(self, aT: int, dT: int) -> int:
        s=aT+dT
        if s>=24:
            return s-24
        else:
            return s
