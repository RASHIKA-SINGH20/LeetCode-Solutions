class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(') {
                // Add '(' only if it is NOT the outermost one
                if (depth > 0) 
                    ans.append(ch);
                depth++;
            } 
            else {
                depth--;
                // Add ')' only if it is NOT the outermost one
                if (depth > 0) 
                    ans.append(ch);
            }
        }
        return ans.toString();
    }
}