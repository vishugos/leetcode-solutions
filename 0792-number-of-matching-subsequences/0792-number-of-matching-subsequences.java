class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        List<Integer>[] pos = new ArrayList[26];

        for(int i = 0; i < 26; i++){
            pos[i] = new ArrayList<>();
        }

        for(int i = 0; i < s.length(); i++){
            pos[s.charAt(i) - 'a'].add(i);
        }
        
        int cnt = 0;

        for(String word : words){

            int prev = -1;
            boolean possible = true;

            for(int i = 0; i < word.length(); i++){

                char ch = word.charAt(i);

                List<Integer> list = pos[ch - 'a']; 

                int index = upperBound(list , prev);

                if(index == list.size()){
                    possible = false;
                    break;
                }
                
                prev = list.get(index);

            }
            if(possible){
                cnt++;
            }
        }
        return cnt;
    }

    public int upperBound(List<Integer> list ,int  prev){

        int left = 0;

        int right = list.size();

        while(left < right){

            int mid = (left + right)/ 2;

            if(list.get(mid) <= prev ){

                left = mid + 1;
            }else{

                right = mid;
            }
        }
        return left;
    }
}