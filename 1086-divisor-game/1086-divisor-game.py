class Solution:
    def divisorGame(self, n: int) -> bool:
        # n % 2 == 0
        return n & 1 == 0
        