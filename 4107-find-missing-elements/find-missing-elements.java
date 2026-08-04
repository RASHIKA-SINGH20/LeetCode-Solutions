class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);
        int number = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++)
        {
            number++;
            while(number < nums[i])
            {
                ans.add(number);
                number++;
            }

            number = nums[i];
        }

        return ans;
    }
}