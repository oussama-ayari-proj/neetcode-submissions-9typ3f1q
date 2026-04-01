class Solution:
    def searchRow(self, row: List[int], target: int) -> bool:
        n = len(row)
        start, end = 0, n-1

        while end - start + 1 > 0:
            mid = int(start + (end - start + 1)/2)
            if row[mid] == target:
                return True
            elif row[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        return False

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n_row, n_col = len(matrix), len(matrix[0])

        for i in range(n_row):
            row = matrix[i]
            if row[0] <= target <= row[-1]:
                return self.searchRow(row,target)
        return False