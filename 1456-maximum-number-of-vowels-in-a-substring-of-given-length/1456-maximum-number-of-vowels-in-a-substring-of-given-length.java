class Solution {
    public int maxVowels(String s, int k) {

        int cnt = 0;
        int max = 0;

        for(int i = 0; i < k ;i++){

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;
            }
        }

        max = cnt;

        for(int i = k ; i < s.length(); i++){

           char remove = s.charAt(i - k);

             if (remove == 'a' || remove == 'e' || remove == 'i' || remove == 'o' || remove == 'u') {
                cnt--;
            }

            char add = s.charAt(i);


            if (add == 'a' || add == 'e' || add == 'i' || add == 'o' || add == 'u') {
                cnt++;
            }

            max = Math.max(max , cnt);
        }
        return max;


    }
}