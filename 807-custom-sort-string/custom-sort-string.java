class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        for(int i = 0 ; i < s.length() ; i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < order.length() ; i++)
        {
            int index = (int) order.charAt(i) - 'a';
            while(freq[index] > 0)
            {
                result.append(order.charAt(i));
                freq[index]--;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            while(freq[i] > 0)
            {
                result.append((char)(i + 'a'));
                freq[i]--;
            }
        }
        return result.toString();
    }
}