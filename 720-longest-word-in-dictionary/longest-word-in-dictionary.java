class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        HashSet<String> set = new HashSet<>();

        String res = "";

        for (String word : words) {

            String prefix = word.substring(0, word.length() - 1);

            if (word.length() == 1 || set.contains(prefix)) {

                set.add(word);

                if (word.length() > res.length()) {
                    res = word;
                }
            }
        }

        return res;
    }
}