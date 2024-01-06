class Solution {
    int count = 0;

    public int totalNQueens(int n) 
    {
        boolean[] vertical = new boolean[n];
        boolean[] d1 = new boolean[2 * n ];
        boolean[] d2 = new boolean[2 * n];
        compute(n, 0, vertical, d1, d2);
        return count;
    }

    public void compute(int n, int row, boolean[] vertical, boolean[] d1, boolean[] d2) 
    {
        if (row >= n) 
        {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) 
        {
            if (!vertical[col] && !d1[row + col] && !d2[row - col + n - 1]) 
            {
                d1[row + col] = true;
                d2[row - col + n - 1] = true;
                vertical[col] = true;

                compute(n, row + 1, vertical, d1, d2);
                d1[row + col] = false;
                d2[row - col + n - 1] = false;
                vertical[col] = false;
            }
        }
    }
}

