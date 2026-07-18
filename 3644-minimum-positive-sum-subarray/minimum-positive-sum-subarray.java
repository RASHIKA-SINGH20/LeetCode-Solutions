class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;

        for (int windowSize = l; windowSize <= r; windowSize++) {

            int low = 0;
            int high = windowSize - 1;
            int sum = 0;

            for (int i = low; i <= high; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) {
                ans = Math.min(ans, sum);
            }

            while (high < n - 1) {

                sum -= nums.get(low);
                low++;

                high++;
                sum += nums.get(high);

                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;

    }
}