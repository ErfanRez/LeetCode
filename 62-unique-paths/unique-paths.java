class Solution {
    public int uniquePaths(int m, int n) {
        int[][] a = new int[m][n];

        return dest(a, m, n ,0, 0);
    }

    private static int dest(int[][] a,int m,int n,int i,int j){
        
        // If the current position (i, j) is out of bounds (i >= m or j >= n), return 0 because it's not a valid path.
        if(i >= m || j >= n ) return 0;

        // If the current position (i, j) is the bottom-right corner of the grid (i == m-1 and j == n-1), return 1 because we've found a valid path.
        if(i == m - 1 && j == n - 1) return 1;

        // Otherwise, calculate the number of paths from the current cell by summing the number of paths from the cell to the right (i, j+1) and the cell below (i+1, j).
        if(a[i][j] > 0) return a[i][j];

        // Store the result in a[i][j] and return it.
        return a[i][j] = dest(a, m, n, i+1, j) + dest(a, m, n, i, j+1);
    }
}