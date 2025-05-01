class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s=sorted(set(nums))[::-1]
        if len(s)<3:
            return max(s)
        return s[2]
        