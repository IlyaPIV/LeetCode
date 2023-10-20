import collections
from typing import List


class Solution:
    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        counter = collections.defaultdict(int)
        count = 0
        for pair in dominoes:
            min_val = min(pair[0], pair[1])
            max_val = max(pair[0], pair[1])
            pair_sorted = (min_val, max_val)
            if pair_sorted in counter:
                count += counter[pair_sorted]
            counter[pair_sorted] += 1
        return count
