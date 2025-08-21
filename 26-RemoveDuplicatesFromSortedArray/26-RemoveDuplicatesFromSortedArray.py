# Last updated: 8/21/2025, 12:12:05 PM
class Solution:
  def removeDuplicates(self, nums: List[int]) -> int:
    i = 0

    for num in nums:
      if i < 1 or num > nums[i - 1]:
        nums[i] = num
        i += 1

    return i