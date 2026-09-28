class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] candidates, int target, int index,
        List<Integer> current, List<List<Integer>> ans) {
        
        if (target == 0) // Target reached
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) // Target became negative
        {
            return;
        }
        for (int i = index; i < candidates.length; i++) // Try every candidate from index
        {
            current.add(candidates[i]);
            // We pass i, not i+1
            // because the same number can be used again
            solve(candidates, target - candidates[i], i,current, ans);
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}