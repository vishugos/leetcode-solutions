class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int cnt = 0;

        while(left <= right){

            String word = words[left];

            char first = word.charAt(0);

            char last = word.charAt(word.length() -1);

            if((first == 'a' || first == 'e' || first == 'i' ||first == 'o' || first == 'u')&&
            
                (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')){

                 cnt++;
                 }

                 left++;
        }

        return cnt;
        
    }
}