class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp = new int[n];
        Arrays.fill(dp, -1);
        return recursion(n, 0);
    }
    public int recursion(int n, int idx){
        if(idx == n)
            return 1;
        if(idx > n) return 0;
        if(dp[idx] != -1) return dp[idx];
        int oneStep = recursion(n, idx + 1);
        int twoSteps = recursion(n, idx + 2);
        return dp[idx] =  oneStep + twoSteps;
    }
}
