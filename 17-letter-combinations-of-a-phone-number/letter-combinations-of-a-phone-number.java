class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] map = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        result.add("");
        if(digits.length() == 0)
        {
            return new ArrayList<>();
        }
        for(int i = 0 ; i < digits.length() ; i++)
        {
            String letters = map[digits.charAt(i) - '0'];
            List<String> ans = new ArrayList<>();
            for(int j = 0 ; j < result.size() ; j++)
            {
                for(int k = 0 ; k < letters.length() ; k++)
                {
                    ans.add(result.get(j) + letters.charAt(k));
                }
            }
            result = ans;
        }
        return result;
    }
}