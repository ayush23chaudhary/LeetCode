# Last updated: 8/21/2025, 12:07:43 PM
class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        l=[]
        for i in nums1:
            if (i in nums2 or i in nums3) and i not in l:
                l.append(i)
        for i in nums2:
            if i in nums3 and i not in l:
                l.append(i)
        return l