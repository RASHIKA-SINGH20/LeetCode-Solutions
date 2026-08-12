class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
        {
            return false;
        }
        HashMap<Character , String> pTow = new HashMap<>();
        HashMap<String , Character> wTop = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++)
        {
            String word = words[i];
            char ch = pattern.charAt(i);

            if(pTow.containsKey(ch) && !pTow.get(ch).equals(word))
            {
                return false;
            }
            if(wTop.containsKey(word) && wTop.get(word) != ch)
            {
                return false;
            }
            pTow.put(ch,word);
            wTop.put(word,ch);
        }
        return true;
    }
}