class Solution {
    public List<Integer> partitionLabels(String s) {

        // store all the occurances
        int [] last = new int[26];

        for(int i = 0; i < s.length();i++){

            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length();i++){

            end = Math.max(end ,last[s.charAt(i) - 'a'] );
            
            //if curr index reaches partation end 
            if(end == i){

                ans.add(end - start + 1);

                
                // start next partation
                 start = i + 1;
            }
        }

        return ans;
    }
}