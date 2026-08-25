class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // agar k greater than length ho gya toh woh sare syeps repeat nhi honge
        if(k < 0)
        {
            k+=nums.length;
        }  
        reverse(nums , 0 , n -1);  // phele poora reverse kr denge
        reverse(nums , 0 , k - 1); //first k element
        reverse(nums , k , n - 1); // remaining
    }
    public void reverse(int[] nums , int left , int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}