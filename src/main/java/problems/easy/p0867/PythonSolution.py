from typing import List


class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        res = []
        columns = len(matrix[0])
        for i in range(columns):
            res.append([row[i] for row in matrix])
        return res
