
class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();

        int left = 0;
        int ans = 0;

        int[] freq = new int[3];

        for (int right = 0; right < n; right++) {

            // Expand window
            freq[s.charAt(right) - 'a']++;

            // Jab tak a, b, c teeno present hain
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                // Valid substrings count karo
                ans += n - right;

                // Reduce window
                freq[s.charAt(left) - 'a']--;

                left++;
            }
        }

        return ans;
    }
}
