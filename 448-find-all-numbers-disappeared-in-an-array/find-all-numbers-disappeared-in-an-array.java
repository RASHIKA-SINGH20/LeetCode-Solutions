class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> all = new HashSet<>();
        HashSet<Integer> missing = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 1 ; i <= nums.length ; i++)
        {
            all.add(i);
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            missing.add(nums[i]);
        }
        for(int num : all)
        {
            if(!missing.contains(num))
            {
                result.add(num);
            }
        }
        return result;
    }
}