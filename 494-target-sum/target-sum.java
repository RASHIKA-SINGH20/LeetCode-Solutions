class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        // Impossible cases
        if (Math.abs(target) > total) {
            return 0;
        }

        if ((total + target) % 2 != 0) {
            return 0;
        }

        int sum = (total + target) / 2;

        int[] dp = new int[sum + 1];

        // One way to make sum 0: choose nothing
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = sum; j >= nums[i]; j--) {

                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }

        return dp[sum];
    }
}