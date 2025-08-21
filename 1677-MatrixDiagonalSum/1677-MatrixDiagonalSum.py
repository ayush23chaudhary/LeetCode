# Last updated: 8/21/2025, 12:08:27 PM
class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n=len(mat[0])
        c=0
        for i in range(len(mat)):
            c+=mat[i][i]
            c+=mat[i][-1-i]
        if n%2!=0:
            c=c-mat[n//2][n//2]
        return c
