# Last updated: 8/21/2025, 12:07:19 PM
class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        #l=[["#"]for i in range(len(nums)) for  j in range(i,len(nums)) for k in range(j,len(nums)) if nums[j]-nums[i]==diff and nums[k]-nums[j] == diff]
        #return len(l)
        '''c=0
        for i in nums:
            if (i+diff) in nums and (i+diff*2) in nums:
                c+=1 
        return c'''
        counter = 0
        numSet = set(nums) 
        for num in nums:
            if (num + diff) in numSet and (num + 2 * diff) in numSet:
                counter += 1
        
        return counter