class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low = 0;
        int high = k - 1;
        int sum = 0;
        for(int i = low ; i <= high ; i++)
        {
            sum += arr[i];
        }

        int count = 0;
        while(high < arr.length)
        {
            if((double) (sum/k) >= threshold)
            {
                count++;
            }
            low++;
            high++;
            if(high == arr.length)
            {
                break;
            }
            sum = sum + arr[high] - arr[low - 1];
        }
        return count;
    }
}