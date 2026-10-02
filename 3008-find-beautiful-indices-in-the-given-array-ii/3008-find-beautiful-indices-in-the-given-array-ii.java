class Solution {

    public List<Integer> beautifulIndices(String s, String a, String b, int k) {

        List<Integer> posA = findOccurrences(s, a);
        List<Integer> posB = findOccurrences(s, b);

        List<Integer> ans = new ArrayList<>();

        int j = 0;

        for (int i : posA) {

            while (j < posB.size() && posB.get(j) < i - k) {
                j++;
            }

            if (j < posB.size() && posB.get(j) <= i + k) {
                ans.add(i);
            }
        }

        return ans;
    }

    private List<Integer> findOccurrences(String text, String pattern) {

        List<Integer> positions = new ArrayList<>();

        int m = pattern.length();
        int n = text.length();

        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else if (len > 0) {
                len = lps[len - 1];
            }
            else {
                lps[i] = 0;
                i++;
            }
        }

        i = 0;
        int j = 0;

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    positions.add(i - m);
                    j = lps[j - 1];
                }
            }
            else if (j > 0) {
                j = lps[j - 1];
            }
            else {
                i++;
            }
        }

        return positions;
    }
}