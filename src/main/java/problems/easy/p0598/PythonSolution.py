import sys
from typing import List


class Solution:
    def maxCount(self, m: int, n: int, ops: List[List[int]]) -> int:
        if len(ops) == 0:
            return m * n
        row_min = m
        col_min = n
        for i in range(len(ops)):
            row_min = min(row_min, ops[i][0])
            col_min = min(col_min, ops[i][1])

        return row_min * col_min
