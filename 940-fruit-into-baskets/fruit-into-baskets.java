class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int res = -1;
        while(high < fruits.length)
        {
            int right = fruits[high];
            map.put(right , map.getOrDefault(right,0) + 1);

            while(map.size() > 2)
            {
                int left = fruits[low];
                map.put(left , map.get(left) - 1);
                if(map.get(left) == 0)
                {
                    map.remove(left);
                }
                low++;
            }
            if(map.size() <= 2)
            {
                res = Math.max(res , high - low + 1);
            }
            high++;
        }
        return res;
    }
}