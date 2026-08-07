class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int  m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c)
        {
            return mat;
        }

        int[][] ans = new int[r][c];

        for(int index = 0 ; index < r*c ; index++)
        {
            int oldRow = index/n;
            int oldCol = index%n;

            int newRow = index/c;
            int newCol = index%c;

            ans[newRow][newCol] = mat[oldRow][oldCol];
        }
        return ans;
    }
}