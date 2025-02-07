class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        if not word:
            return 0
        k = 0
        max_count = 0
        temp_word = word
        while temp_word in sequence:
            k += 1
            temp_word += word
            max_count = max(max_count, k)
        return max_count