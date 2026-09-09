class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;

        for (int i = 0; i < candies.length; i++)
         {
            total += candies[i];
        }

        int low = 1;
        int high = 0;

        for (int i = 0; i < candies.length; i++) 
        {
            high = Math.max(high, candies[i]);
        }

        int result = 0;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            long child = 0;

            for (int i = 0; i < candies.length; i++) {
                child += candies[i] / mid;
            }

            if (child >= k) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}