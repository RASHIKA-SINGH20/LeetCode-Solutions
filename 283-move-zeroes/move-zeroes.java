class Solution {
    public void moveZeroes(int[] nums) {
        move(nums, 0, 0);
    }
    
    static void move(int[] nums, int i, int j) {
        if (i == nums.length) return;
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            j++;
        }
        move(nums, i + 1, j);
    }
}
