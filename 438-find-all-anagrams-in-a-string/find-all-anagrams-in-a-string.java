class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        // Frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            count[s.charAt(right) - 'a']--;

            // Window size becomes greater than p
            if (right - left + 1 > p.length()) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            // If window size is same as p
            if (right - left + 1 == p.length()) {

                boolean valid = true;

                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ans.add(left);
                }
            }
        }

        return ans;
    }
}