class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for(String word : dictionary)
        {
            if(isSubsequence(s,word))
            {
                if(word.length() > res.length())
                    res = word;
                 else if(word.length() == res.length() && word.compareTo(res) < 0)
                {
                    res = word;
                }
            }
        }
        return res;
    }
    public boolean isSubsequence(String s , String word)
    {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < word.length())
        {
            if(s.charAt(i) == word.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}