class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
        {
            return "";
        }

        int[] freq = new int[128];

        for(int i = 0 ; i < t.length() ; i++)
        {
            freq[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();

        while(right < s.length())
        {
            char r = s.charAt(right);

            if(freq[r] > 0)
            {
                required--;
            }
            freq[r]--;
            right++;

            while(required == 0)
            {
                if (right - left < minLen)
                {
                minLen = right-left;
                start = left;
                }
                char l = s.charAt(left);
                freq[l]++;
                if(freq[l] > 0)
                {
                    required++;
                }
                left++;
            }   
        }
        if (minLen == Integer.MAX_VALUE)
        {
            return ""; 
        }
        return s.substring(start, start + minLen);
    }
}