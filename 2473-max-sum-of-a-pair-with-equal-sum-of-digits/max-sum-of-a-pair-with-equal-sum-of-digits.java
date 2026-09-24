class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[100000];
        int ans = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            int n = nums[i];
            int sum = 0;
            while(n != 0)
            {
                sum += n%10;
                n /= 10;
            }

            if(max[sum] != 0)
            {
                ans = Math.max(ans, max[sum] + nums[i]); // We already have a number with same digit sum
            }

            max[sum] = Math.max(max[sum], nums[i]); // Store the largest number for this digit sum
        }
        return ans;
    }
}