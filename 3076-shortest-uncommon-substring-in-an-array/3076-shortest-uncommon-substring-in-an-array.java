class Solution {
    public String[] shortestSubstrings(String[] arr) {

        String[] ans = new String[arr.length];

        // 1. Har string ke liye
        for (int i = 0; i < arr.length; i++) {

            String best = "";
            String word = arr[i];

            // 2. Substring ki length 1 se start
            for (int len = 1; len <= word.length(); len++) {

                // 3. Starting position
                for (int start = 0; start + len <= word.length(); start++) {

                    String sub = word.substring(start, start + len);

                    boolean unique = true;

                    // 4. Baaki strings mein check
                    for (int j = 0; j < arr.length; j++) {

                        if (i == j) {
                            continue;
                        }

                        if (arr[j].contains(sub)) {
                            unique = false;
                            break;
                        }
                    }

                    // Unique substring mila
                    if (unique) {

                        // Pehla unique substring ya lexicographically smaller
                        if (best.equals("") || sub.compareTo(best) < 0) {
                            best = sub;
                        }
                    }
                }

                // Is length ka answer mil gaya,
                // ab longer substring check karne ki zarurat nahi
                if (!best.equals("")) {
                    break;
                }
            }

            ans[i] = best;
        }

        return ans;
    }
}