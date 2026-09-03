class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        boolean allEven = true;

        for(int i = 0 ; i < nums1.length ; i++) // phele min odd nikalenge agar ek bhi odd hua toh all even immpossible
        {
            if(nums1[i] % 2 != 0)
            {
                allEven = false;
                minOdd = Math.min(minOdd , nums1[i]);
            }
        }

        if(allEven)
        {
            return true;
        }

        for(int i = 0 ; i < nums1.length ; i++)  // Every even number must be greater than&&the smallest odd number
        {
            if(nums1[i] % 2 == 0 && nums1[i] < minOdd)
            {
                return false;
            }
        }
        return true;
    }
}