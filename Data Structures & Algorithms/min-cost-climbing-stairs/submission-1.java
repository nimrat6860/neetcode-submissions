class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost, 0), solve(cost, 1));
    }
    public int solve(int cost[], int idx){
        if(idx >= cost.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int oneStep = cost[idx] + solve(cost, idx + 1);
        int twoStep = cost[idx] + solve(cost, idx + 2);
        return dp[idx] = Math.min(oneStep, twoStep);
    }
}
