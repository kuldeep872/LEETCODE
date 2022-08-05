class Solution {
    public int combinationSum4(int[] nums, int target) {
       int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        
        return helper(target, nums, dp);
    }
    
    private int helper(int T, int[] nums, int[] dp) {
        // base case
        if (T == 0) {
            return 1;
        }
        
        if (dp[T] != -1) {
            return dp[T];
        }
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= T) {
                count += helper(T - nums[i], nums, dp);
            }
        }
        
        return dp[T] = count; 
    }
}