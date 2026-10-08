class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int [] freqP = new int[26];

        int [] windowSize = new int[26];

        int left = 0;

        if(s.length() < p.length()){
            return ans;
        }

        //sabse pehle p ki freq nikal lunga

        for(int i = 0; i < p.length(); i++){

            freqP[p.charAt(i) - 'a']++;
        }

        // ab sliding window aur fixed window 

        for(int right = 0; right < s.length(); right++){

            windowSize[s.charAt(right) - 'a']++;

            // agr window size p se bada ho gya 

            if(right - left + 1 > p.length()){
                windowSize[s.charAt(left) - 'a']--;
                left++;
            }

            // freq same hai to anagrams hai
            if(right - left + 1 == p.length() 
            && Arrays.equals(freqP , windowSize)){
                ans.add(left);
            }
        }
        return ans;
    }
}