class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while(i < j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum == target)
            {
                i++;
                j++;
                return new int[]{i,j};
            }
            else if(sum < target)
            {
                i++;
            }
            else if(sum > target)
            {
                j--;
            }
        }
        return new int[]{};
    }
}