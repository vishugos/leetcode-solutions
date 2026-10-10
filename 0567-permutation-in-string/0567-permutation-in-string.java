
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freqWindow = new int[26];

        // s1 ki frequency
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        // s2 par sliding window
        for (int right = 0; right < s2.length(); right++) {

            // Naya character add karo
            freqWindow[s2.charAt(right) - 'a']++;

            // Window size s1 se bada ho to left character remove karo
            if (right - left + 1 > s1.length()) {
                freqWindow[s2.charAt(left) - 'a']--;
                left++;
            }

            // Same size ki window ki frequency compare karo
            if (right - left + 1 == s1.length()
                    && Arrays.equals(freq1, freqWindow)) {
                return true;
            }
        }

        return false;
    }
}
