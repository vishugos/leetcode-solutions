class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> li = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {

            String word = words.get(i);

            int start = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(j) == separator) {

                    if (start < j) {
                        li.add(word.substring(start, j));
                    }

                    start = j + 1;
                }
            }

            // Last remaining substring
            if (start < word.length()) {
                li.add(word.substring(start));
            }
        }

        return li;
    }
}
