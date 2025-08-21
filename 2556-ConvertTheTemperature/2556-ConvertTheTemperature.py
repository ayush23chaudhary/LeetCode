# Last updated: 8/21/2025, 12:07:07 PM
class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        Ken = celsius + 273.15
        Fa = celsius * 1.80 + 32.00
        l=[Ken, Fa]
        return l
        