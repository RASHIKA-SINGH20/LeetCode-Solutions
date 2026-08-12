class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> first = new HashMap<>();
        HashMap<Character , Character> second = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(first.containsKey(ch1) && first.get(ch1) != ch2)
            {
                return false;
            }
            if(second.containsKey(ch2) && second.get(ch2) != ch1)
            {
                return false;
            }
            first.put(ch1,ch2);
            second.put(ch2,ch1);
        }
        return true;
    }
}