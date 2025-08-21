# Last updated: 8/21/2025, 12:12:12 PM
class Solution:
    def reverse(self, x: int) -> int:
        """if x in range(-2**31,2**31-1):
            if x>=0:
                return int(str(x)[::-1])
            else:
                x=-(x)
                return int("-"+str(x)[::-1])
        else:
            return """
        ans = 0
        sign = -1 if x < 0 else 1
        x *= sign
        while x:
            ans = ans * 10 + x % 10
            x //= 10

        return 0 if ans < -2**31 or ans > 2**31 - 1 else sign * ans
        