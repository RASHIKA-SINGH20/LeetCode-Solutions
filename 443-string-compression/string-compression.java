class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read != chars.length)
        {
            char present = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == present)
            {
                read++;
                count++;
            }

            chars[write] = present;
            write++;

            if (count > 1)
            {
                String num = String.valueOf(count);
                for (int j = 0; j < num.length(); j++) 
                {
                    chars[write] = num.charAt(j);
                    write++;
                }
            }
        }
        return write;
    }
}