class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int missing = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(set.contains(nums[i]))
            {
                duplicate = nums[i];
            }
            else
            {
                set.add(nums[i]);
            }
        }

        for(int i = 1 ; i <= nums.length ; i++)
        {
            if(!set.contains(i))
            {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate , missing};
    }
}