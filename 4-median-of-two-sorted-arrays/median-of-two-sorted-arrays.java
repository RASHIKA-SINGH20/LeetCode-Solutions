class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int k = 0;
        for(int i = 0 ; i < nums1.length ; i++)
        {
            merged[k] = nums1[i];
            k++;
        }
        for(int i = 0 ; i < nums2.length ; i++)
        {
            merged[k] = nums2[i];
            k++;
        }
        for(int i = 0 ; i < merged.length ; i++)
        {
            for(int j = 0 ; j < merged.length - i - 1 ; j++)
            {
                if(merged[j] > merged[j+1])
                {
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
        }
        double median;
        int n = merged.length;
        if(merged.length % 2 != 0)
        {
            median = merged[n/2];
        }
        else
        {
            median = (merged[n/2] + merged[n/2 - 1])/2.0;
        }
        return median;
    }
}