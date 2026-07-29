class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();

        for(int i = 0 ; i < nums1.length ; i++)
        {
            list1.add(nums1[i]);
        }

        for(int i = 0  ;i < nums2.length ; i++)
        {
            list2.add(nums2[i]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        for(int num : list1)
        {
            if(!list2.contains(num))
            {
                num1.add(num);
            }
        }

        for(int num : list2)
        {
            if(!list1.contains(num))
            {
                num2.add(num);
            }
        }

        ans.add(num1);
        ans.add(num2);

        return ans;
    }
}