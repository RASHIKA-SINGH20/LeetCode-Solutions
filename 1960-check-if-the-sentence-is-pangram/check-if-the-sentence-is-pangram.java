class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> list = new HashSet<>();

        for(int i = 0 ; i < sentence.length() ; i++)
        {
            list.add(sentence.charAt(i));
        }

        return list.size() == 26;
    }
}