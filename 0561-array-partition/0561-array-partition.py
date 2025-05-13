class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        _max = 0
        for i in range(0, len(nums) - 1, 2):
            _max += nums[i]

        
        return _max