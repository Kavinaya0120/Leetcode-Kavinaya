// Last updated: 8/12/2026, 11:36:21 PM
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int pushes = 0;
        int position = 1;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;

            pushes += freq[i] * position;

            if ((26 - i) % 8 == 0)
                position++;
        }

        return pushes;
    }
}