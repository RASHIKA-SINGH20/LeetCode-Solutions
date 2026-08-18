class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int r = 0 ; r < 4 ; r++)
        {
            boolean same = true;
            for(int i = 0 ; i < mat.length ; i++)
            {
                for(int j = 0 ; j < mat.length ; j++)
                {
                    if(mat[i][j] != target[i][j])
                    {
                        same = false;
                        break;
                    }
                }
                if(!same)
                {
                    break;
                }
            }
            if(same)
            {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    public void rotate(int[][] mat)
    {
        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = i + 1 ; j < mat.length ; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0 ; i < mat.length ; i++)
        {
            int left = 0;
            int right = mat.length - 1;

            while(left < right)
            {
                int temp = mat[i][left];
                mat[i][left] = mat [i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}