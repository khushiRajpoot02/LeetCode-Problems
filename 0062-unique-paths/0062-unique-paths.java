class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return sol(0, 0, m, n, dp);
    }
    public int sol(int row, int col, int m , int n, int[][] dp){
        if(row > m-1 || col > n-1)return 0;
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(dp[row][col]!=-1)return dp[row][col];
        int onWay = sol(row+1, col, m, n, dp);
        int secWay = sol(row, col+1, m, n, dp);
        return dp[row][col] = onWay+secWay;
    }
}