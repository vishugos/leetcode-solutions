class Solution {
    public int minAnagramLength(String s) {

        int n = s.length();

        for (int len = 1; len <= n; len++) {

            // n must be divisible by len
            if (n % len != 0) {
                continue;
            }

            // First block ki frequency
            int[] base = new int[26];

            for (int i = 0; i < len; i++) {
                base[s.charAt(i) - 'a']++;
            }

            boolean valid = true;

            // Baaki blocks check karo
            for (int start = len; start < n; start += len) {

                int[] freq = new int[26];

                for (int i = start; i < start + len; i++) {
                    freq[s.charAt(i) - 'a']++;
                }

                // Base block aur current block compare
                for (int i = 0; i < 26; i++) {

                    if (base[i] != freq[i]) {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    break;
                }
            }

            // Sabhi blocks anagram hain
            if (valid) {
                return len;
            }
        }

        return n;
    }
}