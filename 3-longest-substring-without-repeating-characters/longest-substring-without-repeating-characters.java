class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int res = 0;
        while(high < s.length())
        {
            char right = s.charAt(high);
            map.put(right , map.getOrDefault(right , 0) + 1);
            while(map.get(right) > 1)
            {
                char left = s.charAt(low);
                map.put(left , map.get(left) - 1);
                if(map.get(left) == 0)
                {
                    map.remove(left);
                }
                low++;
            }
            res = Math.max(res , high - low + 1);
            high++;
        }
        return res;
    }
}