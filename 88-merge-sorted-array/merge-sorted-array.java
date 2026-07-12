class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m + n];
        for(int i = 0 ; i < m ; i++)
        {
            merge[i] = nums1[i];
        }
        for(int j = 0 ; j < n ; j++)
        {
            merge[m + j] = nums2[j];
        }
        Arrays.sort(merge);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merge[i];
        }
    }
}