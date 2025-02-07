class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        if not word:
            return 0
        k = 0
        temp_word = word
        while temp_word in sequence:
            k += 1
            temp_word += word
        return k