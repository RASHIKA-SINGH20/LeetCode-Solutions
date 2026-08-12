class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] st = new int[256];
        int[] ts = new int[256];

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(st[ch1] != ts[ch2])
            {
                return false;
            }
            st[ch1] = i+1;
            ts[ch2] = i+1;
        }
        return true;
    }
}