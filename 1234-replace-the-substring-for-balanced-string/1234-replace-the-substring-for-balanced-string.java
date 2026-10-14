
class Solution {
    public int balancedString(String s) {

        int n = s.length();
        int limit = n / 4;

        int[] count = new int[128];

        //  Puri string ki frequency count karo
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        // Already balanced hai toh 0
        if (count['Q'] == limit &&
            count['W'] == limit &&
            count['E'] == limit &&
            count['R'] == limit) {
            return 0;
        }

        int left = 0;
        int ans = n;

        // Sliding window
        for (int right = 0; right < n; right++) {

            // Current character ko replacement window mein include karo
            count[s.charAt(right)]--;

            // Check karo ki window ke bahar ki string balance ho sakti hai
            while (count['Q'] <= limit &&
                   count['W'] <= limit &&
                   count['E'] <= limit &&
                   count['R'] <= limit) {

                ans = Math.min(ans, right - left + 1);

                // Window ko chhota karo
                count[s.charAt(left)]++;
                left++;
            }
        }

        return ans;
    }
}
