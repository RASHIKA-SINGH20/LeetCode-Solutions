class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] arr = new int[m*n];
        int index = 0;

        for(int d = 0 ; d < m + n + 1 ; d++)
        {
            int row = (d < n) ? 0 : d - n + 1;
            int col = (d < n) ? d : n - 1;

            List<Integer> diagonal = new ArrayList<>();

            while(row < m && col >= 0)
            {
                diagonal.add(mat[row][col]);
                row++;
                col--;
            }

            if(d % 2 == 0)
            {
                Collections.reverse(diagonal);
            }

            for(int i = 0 ; i < diagonal.size() ; i++)
            {
                arr[index++] = diagonal.get(i);
            }
        }
        return arr;
    }
}