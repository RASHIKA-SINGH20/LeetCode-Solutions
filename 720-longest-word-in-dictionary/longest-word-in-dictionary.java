class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();

        for(String word : words)
        {
            set.add(word);
        }
        String res = "";
        for(String word : words)
        {
            boolean longest = true;
            for(int i = 1 ; i < word.length() ; i++)
            {
                String prefix = word.substring(0,i); // substring dekh rahe math ho raha ki nhi to previous

                if(!set.contains(prefix))
                {
                    longest = false;
                    break;
                }
            }
            if(longest)
            {
                if(word.length() > res.length())
                {
                    res = word;
                }
                else if(word.length() == res.length() && word.compareTo(res) < 0)
                {
                    res = word;
                }
            }
        }
        return res;
    }
}