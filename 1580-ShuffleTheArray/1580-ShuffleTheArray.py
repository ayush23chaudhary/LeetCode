# Last updated: 8/21/2025, 12:08:33 PM
class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        l=[]
        for i in range(n):
            l.append(nums[-1])
            nums.pop(-1)
        l.reverse()
        l1=[]
        for i in range(n):
            l1.append(nums[i])
            l1.append(l[i])        
        return l1