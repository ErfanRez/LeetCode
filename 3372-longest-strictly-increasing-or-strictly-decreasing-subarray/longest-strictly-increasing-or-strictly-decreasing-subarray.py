class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        maxInc, maxDec, length = 1, 1, 1
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                length += 1
            else:
                maxInc = max(maxInc, length)
                length = 1

        maxInc = max(maxInc, length)
        length = 1

        for i in range(1, len(nums)):
            if nums[i] < nums[i - 1]:
                length += 1
            else:
                maxDec = max(maxDec, length)
                length = 1
                
        maxDec = max(maxDec, length)
        return max(maxInc, maxDec)
        