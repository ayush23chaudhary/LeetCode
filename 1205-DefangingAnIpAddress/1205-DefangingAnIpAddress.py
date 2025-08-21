# Last updated: 8/21/2025, 12:09:02 PM
class Solution:
    def defangIPaddr(self, address: str) -> str:
        s=address.replace(".","[.]")
        return s