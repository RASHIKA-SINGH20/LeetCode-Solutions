class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        for (int count = 0; count < s.length(); count++) {

            int maxFreq = 0;
            int maxChar = 0;

            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = i;
                }
            }

            for (int i = 0; i < maxFreq; i++) {
                ans.append((char) maxChar);
            }

            freq[maxChar] = 0;
        }

        return ans.toString();
    }
}