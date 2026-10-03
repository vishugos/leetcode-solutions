import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        // har character ke saare indices store karenge
        List<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        // s ke characters ki positions store karo
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        // har word ko check karo
        for (String word : words) {

            int prev = -1;
            boolean possible = true;

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                // is character ki saari positions
                List<Integer> list = pos[ch - 'a'];

                // prev ke baad sabse pehli position dhoondo
                int index = upperBound(list, prev);

                // Agar koi position nahi mili
                if (index == list.size()) {
                    possible = false;
                    break;
                }

                // current character ki selected position
                prev = list.get(index);
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }

    // prev se strictly greater first index
    private int upperBound(List<Integer> list, int prev) {

        int left = 0;
        int right = list.size();

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) <= prev) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}