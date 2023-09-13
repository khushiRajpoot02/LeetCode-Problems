class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // using recursion+dp
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        int[][] dp = new int[l1+1][l2+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
      return  sol(0, 0, 0, s1, s2, s3, dp);
    }
    public boolean sol(int idx1, int idx2, int idx3, String s1, String s2, String s3, int[][]dp){
        if(idx3 == s3.length()){
            if(idx1 == s1.length() && idx2 == s2.length()){
                return true;
            }
            return false;
        }
        if(dp[idx1][idx2]!=-1){
          if(dp[idx1][idx2] == 1)return true;
          return false;
        }
        boolean fist = false;
        boolean secon = false;
        if(idx1 < s1.length() && s1.charAt(idx1) == s3.charAt(idx3)){
          fist =   sol(idx1+1, idx2, idx3+1, s1, s2, s3, dp);
        }
        if(idx2 < s2.length() && s2.charAt(idx2) == s3.charAt(idx3)){
          secon = sol(idx1, idx2+1, idx3+1, s1, s2, s3, dp);
        }
        dp[idx1][idx2] = fist || secon == true ? 1 : 0;
        return fist || secon;
    }
}