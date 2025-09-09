class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i=text1.length();
        int j=text2.length();
        int dp[][]=new int[i+1][j+1];
        for(int m=1;m<=i;m++){
            for(int n=1;n<=j;n++){
                if(text1.charAt(m-1) == text2.charAt(n-1)){
                    dp[m][n]=1+dp[m-1][n-1];
                }else{
                    dp[m][n] = Math.max(dp[m-1][n], dp[m][n-1]);
                }
            }
        }
        return dp[i][j];
    }
}
