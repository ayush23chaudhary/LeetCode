# Last updated: 8/21/2025, 12:06:33 PM
class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        one=s.count("1")-1
        ze=s.count("0")
        ns="1"
        for i in range(ze):
            ns+="0"
        for i in range(one):
            ns+="1"
        ns=ns[::-1]
        return ns
        
