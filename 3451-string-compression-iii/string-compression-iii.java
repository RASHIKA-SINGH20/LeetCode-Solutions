class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int read = 0;

        while(read != word.length())
        {
            char ch = word.charAt(read);
            int count = 0;
            while(read != word.length() && word.charAt(read) == ch && count < 9)
            {
                read++;
                count++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}