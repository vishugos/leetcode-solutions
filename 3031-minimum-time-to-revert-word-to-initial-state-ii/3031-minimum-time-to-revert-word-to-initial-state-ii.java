class Solution {
    public int minimumTimeToInitialState(String word, int k) {

        int n = word.length();

        // Z-array
        int[] z = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while (i + z[i] < n &&
                   word.charAt(z[i]) == word.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        for (int shift = k; shift < n; shift += k) {

            // Remaining suffix must match the original prefix
            if (z[shift] >= n - shift) {
                return shift / k;
            }
        }

        // If no earlier shift work
        // all characters can be replaced after ceil(n/k) operations
        return (n + k - 1) / k;
    }
}